package fabriciocarvalho348.com.github.pedidos.domain.enums;

public enum Perfil {

    ADMIN(1, "ROLE_ADMIN"),
    CLIENTE(2, "ROLE_CLIENTE");

    private int cod;
    private String descricao;

    Perfil(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public static Perfil toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (Perfil x : Perfil.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }
}
