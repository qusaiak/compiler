package org.Angular;
import AST.Program;
import Visitor.BaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws IOException {
        String source="src/tests/test1/product.component.ts";
        CharStream cs=fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        AngularParser parser= new AngularParser(tokenStream);
        ParseTree tree =parser.program();
        Program doc=(Program) new BaseVisitor().visit(tree);
        System.out.println("\n\n\n\n");
        System.out.println("******** AST TREE:\n");
        print_ast(tree,0);
        System.out.println("\n\n\n\n");
        System.out.println("******** PROGRAM:\n");
        System.out.println(doc);
    }
    static void print_ast(ParseTree tree, int depth) {
        if (tree.getChildCount() != 0) {
            System.out.println(getIndent(depth) + tree.getClass().getSimpleName().replace("Context", ""));

            for (int i = 0; i < tree.getChildCount(); i++) {
                print_ast(tree.getChild(i), depth + 1);
            }
        }
    }

    // indentation based on depth
    private static String getIndent(int depth) {
        return "\t".repeat(Math.max(0, depth));
    }
}
