@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @GetMapping
    public List<String> listarProdutos() {
        return List.of("Camisa", "Notebook", "Fone Bluetooth");
    }
}