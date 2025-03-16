import java.io.File

fun main() {
    val javaCode = """
        public class HelloWorld {
            public static void main(String[] args) {
                System.out.println("Hello, Java from Kotlin!");
            }
        }
    """.trimIndent()

    val fileName = "HelloWorld.java"
    val file = File(fileName)
    file.writeText(javaCode)
    
    println("Java file '$fileName' has been created successfully!")
}
