package p6.e2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field; 

public class Mapper {
	private String classTag = "nombreClase";
	private String fieldTag = "nombreAtributo";
	private String valueTag = "nombreValor";
	
	private String wrapTag(String tag, String word) {
		String wrapped = "<" + tag + ">" + word + "</" + tag + ">\n";
		System.out.print("  " + wrapped);
		return wrapped;
	}
	public Mapper() {}
	
	private FileWriter createFileWriter(String fileName) throws IOException {
        return new FileWriter(fileName, false);
    }

    private void appendToFileWriter(FileWriter fileWriter, String word) throws IOException {
        fileWriter.write(word);
    }
	
	public void mapObject (Object o) {
		System.out.println("Object to map: " + o);
		Class <?> classToMap = o.getClass();
		try {
			String filename = classToMap.getAnnotation(Archivo.class).nombre();
			System.out.println("File prewiew: \n");
			FileWriter f = this.createFileWriter(filename);
			this.appendToFileWriter(f, 
					this.wrapTag(this.classTag, classToMap.getSimpleName())
			);
			for (Field x : classToMap.getDeclaredFields()) {
				if (x.isAnnotationPresent(AlmacenarAtributo.class)) {
					x.setAccessible(true);
					this.appendToFileWriter(f, 
							this.wrapTag(this.fieldTag, x.getName())
					);
					this.appendToFileWriter(f, 
							this.wrapTag(this.valueTag, x.get(o).toString())
					);
				}
			}
			f.close();
		    Path path = FileSystems.getDefault().getPath(filename).toAbsolutePath();
		    System.out.println("\n Successfully wrote file:\n  " + path);
		} catch (NullPointerException e) {
			System.out.println("Class is missing annotations");
		} catch (Exception e) {
			System.out.println("An error occurred.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

    public static void main(String[] args) {
        Mapper m = new Mapper();
        m.mapObject(new Mapeado());
//        m.mapObject(new String("d"));
    }
}
