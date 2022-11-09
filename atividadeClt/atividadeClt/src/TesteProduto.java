public class TesteProduto {
    public static void main(String[] args) {
        System.out.println();

        Fornecedor f1 = new Fornecedor("Zé Maria", "111.222.333/0001-02", "9.8877-6655");
        Fornecedor f2 = new Fornecedor("Cláudio", "999.888.777/0001-03", "9.6655-4433");

        Produto p1 = new Produto("TV LCD", 1, 3500.00, f1);
        Produto p2 = new Produto("Notebook", 2, 2000.00, f2);
        Produto p3 = new Produto("Impressora", 3, 232.00, f2);
    }
}


