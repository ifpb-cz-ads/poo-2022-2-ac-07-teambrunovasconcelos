public class BMExercicio7 {
    public static void main(String[] args) {
        BMExercicio4 novoEquipamento = new BMExercicio4();
        BMExercicio5 novoComputador = new BMExercicio5();

        novoEquipamento.setTipo("Eltro-doméstico");
        novoEquipamento.setNumeracao(123456);

        novoComputador.setTipo("Eletrônico");
        novoComputador.setNumeracao(654321);
        novoComputador.setModelo("Acer");
        novoComputador.setHD("1TB");

        System.out.println(
                "Informações Equipamento: " + novoEquipamento.getTipo() + ", " + novoEquipamento.getNumeracao());

        System.out.println("Informações computador: ");
        System.out.println(novoComputador.getTipo());
        System.out.println(novoComputador.getNumeracao());
        System.out.println(novoComputador.getModelo());
        System.out.println(novoComputador.getHD());
    }
}
