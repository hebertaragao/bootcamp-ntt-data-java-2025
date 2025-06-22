@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final RestTemplate restTemplate;

    public PedidoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/produtos")
    public ResponseEntity<String[]> buscarProdutos() {
        String[] produtos = restTemplate.getForObject("http://catalogodeprodutos/produtos", String[].class);
        return ResponseEntity.ok(produtos);
    }
}

@Configuration
class Config {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}