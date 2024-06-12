import java.text.Normalizer;

    public class StringUtils {

        public static String removerAcentuacao(String texto) {
        // Normaliza o texto para decompor os caracteres acentuados
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        // Remove as marcas diacríticas (acentos)
        return textoNormalizado.replaceAll("\\p{M}", "");
    }
}
