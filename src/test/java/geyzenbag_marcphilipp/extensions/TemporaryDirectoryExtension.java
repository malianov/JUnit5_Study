/*
package geyzenbag_marcphilipp.extensions;

import org.junit.jupiter.api.extension.*;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class TemporaryDirectoryExtension implements ParameterResolver, AfterEachCallback {

    @Override
    public boolean supports(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType().equals(Path.class);
    }

    @Override
    public Object resolve(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return extensionContext.getStore()
                .getOrComputeIfAbsent("tempDir", key -> createTempDir());
    }

    private Path createTempDir() {
        try {
            return Files.createTempDirectory("junit");
        } catch (IOException e) {
            throw new ParameterResolutionException("Could not create temp dir", e);
        }
    }

    @Override
    public void afterEach(TestExtensionContext context) throws Exception {
        Path tempDir = context.getStore().get("tempDir", Path.class);
        if (tempDir != null) {
            deleteRecursively(tempDir);
        }
    }

    private void deleteRecursively(Path root) throws IOException {
        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("deleting file " + file);
                Files.delete(file);
                return super.visitFile(file, attrs);
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.println("deleting dir " + dir);
                Files.delete(dir);
                return super.postVisitDirectory(dir, exc);
            }
        });
    }

}
*/
