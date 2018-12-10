import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleTest {

    @Rule
    public TestName name = new TestName();

    private List<Path> inputPath(String name) {
        try {
            return Files.list(new File("./examples/io/").toPath())
                    .filter(path -> {
                        String fileName = path.getFileName().toString();
                        return fileName.endsWith(".in") && (fileName.contains(name + "-") || fileName.contains(name + "."));
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private String getOutputPath(String name) {
        // in case there is no input file
        return "./examples/io/" + name + ".out";
    }

    private String getFileOutput(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return "";
        }
    }

    @Test public void example1() { exampleTest(name.getMethodName()); }
    @Test public void example2() { exampleTest(name.getMethodName()); }
    @Test public void example3() { exampleTest(name.getMethodName()); }
    @Test public void example4() { exampleTest(name.getMethodName()); }
    @Test public void example5() { exampleTest(name.getMethodName()); }
    @Test public void example6() { exampleTest(name.getMethodName()); }
    @Test public void example7() { exampleTest(name.getMethodName()); }
    @Test public void example8() { exampleTest(name.getMethodName()); }
    @Test public void example9() { exampleTest(name.getMethodName()); }
    @Test public void example10() { exampleTest(name.getMethodName()); }
    @Test public void example11() { exampleTest(name.getMethodName()); }
    @Test public void example12() { exampleTest(name.getMethodName()); }
    @Test public void example13() { exampleTest(name.getMethodName()); }
    @Test public void example14() { exampleTest(name.getMethodName()); }
    @Test public void example15() { exampleTest(name.getMethodName()); }
    @Test public void example16() { exampleTest(name.getMethodName()); }
    @Test public void example17() { exampleTest(name.getMethodName()); }


    @Test(expected = RuntimeException.class)
    public void rte1() { exampleTest(name.getMethodName()); }

    @Test(expected = RuntimeException.class)
    public void rte2() { exampleTest(name.getMethodName()); }

    @Test(expected = RuntimeException.class)
    public void rte3() { exampleTest(name.getMethodName()); }

    @Test(expected = RuntimeException.class)
    public void rte4() { exampleTest(name.getMethodName()); }

    @Test(expected = RuntimeException.class)
    public void rte5() { exampleTest(name.getMethodName()); }

    @Test(expected = RuntimeException.class)
    public void rte6() { exampleTest(name.getMethodName()); }

    @Test(expected = RuntimeException.class)
    public void rte7() { exampleTest(name.getMethodName()); }

    @Test(expected = RuntimeException.class)
    public void rte8() { exampleTest(name.getMethodName()); }

    private void exampleTest(String alias) {
        Path path = new File("./examples/" + alias + ".x").toPath();
        List<Path> inputs = inputPath(alias);
        String[] args = new String[1];
        args[0] = path.toString();
        String tmpOutputName = "./tmpOutput";
        if (inputs.isEmpty()) {
            System.out.println("Running test " + alias + ": no input");
            try {
                PrintStream stdout = System.out;
                PrintStream tempOutput = new PrintStream(new File(tmpOutputName));
                System.setOut(tempOutput);
                Main.main(args);
                tempOutput.close();
                System.setOut(stdout);
                String output = getFileOutput(tmpOutputName);
                String answer = getFileOutput(getOutputPath(alias));
                Assert.assertEquals(answer.trim(), output.trim());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            for (Path input: inputs) {
                System.out.println("Running test " + alias + ": " + input.getFileName());
                try {
                    InputStream stdin = System.in;
                    PrintStream stdout = System.out;
                    InputStream inputStream = new FileInputStream(input.toString());
                    PrintStream tempOutput = new PrintStream(new File("./tmpOutput"));
                    System.setIn(inputStream);
                    System.setOut(tempOutput);
                    Main.main(args);
                    tempOutput.close();
                    inputStream.close();
                    System.setIn(stdin);
                    System.setOut(stdout);
                    String output = getFileOutput(tmpOutputName);
                    String answer = getFileOutput(input.toString().replace(".in", ".out"));
                    Assert.assertEquals(answer.trim(), output.trim());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
