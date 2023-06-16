public class EmbaralhadorInverso implements Embaralhador {
    @Override
    public String shuffle(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }
}
