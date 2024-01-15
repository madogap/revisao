package estadobrasileiros;

public enum EstadoBrasileiro {
    //Pode vir de um banco de dados ou de uma API inves de usar um enum
    //Enum dados que nao se modificam
    ACRE("AC","Acre",12,"NORTE"),
    ALAGOAS("AL","Alagoas",27,"NORDESTE"),
    AMAPA("AP","Amapá",16,"NORTE"),
    AMAZONAS("AM","Amazonas",13,"NORTE"),
    BAHIA("BA","Bahia",29,"NORDESTE"),
    CEARA("CE","Ceará",23,"NORDESTE"),
    DISTRIO_FEDERAL("DF","Distrito Federal",53,"CENTRO-OESTE"),
    ESPIRITO_SANTO("ES","Espírito Santo",32,"SUDESTE"),
    GOIAS("GO","Goiás",52,"CENTRO-OESTE"),
    MARANHAO("MA","Maranhão",21,"NORDESTE"),
    MATO_GROSSO("MT","Mato Grosso",51,"CENTRO-OESTE"),
    MATO_GROSSO_DO_SUL("MS","Mato Grosso do Sul",50,"CENTRO-OESTE"),
    MINAS_GERAIS("MG","Minas Gerais",31,"SUDESTE"),
    PARA("PA","Pará",15,"NORTE"),
    PARAIBA("PB","Paraíba",25,"NORDESTE"),
    PARANA("PR","Paraná",41,"SUL"),
    PERNAMBUCO("PE", "Pernambuco", 26,"NORDESTE"),
    PIAUI("PI","Piauí",22,"NORDESTE"),
    RIO_GRANDE_DO_NORTE("RN","Rio Grande do Norte",24,"NORDESTE"),
    RIO_GRANDE_DO_SUL("RS","Rio Grande do Sul",43,"SUL"),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 33,"SUDESTE"),
    RONDONIA("RO","Rondônia",11,"NORTE"),
    RORAIMA("RR","Roraima",14,"NORTE"),
    SANTA_CATARINA("SC","Santa Catarina",42,"SUL"),
    SAO_PAULO("SP", "São Paulo", 35,"SUDESTE"),
    SERGIPE("SE","Sergipe",28,"NORDESTE"),
    TOCANTINS("TO","Tocantins",17,"NORTE");

    private String nome;
    private String sigla;
    private int ibge;
    private String regiao;

    //Construtor
    private EstadoBrasileiro(String sigla, String nome, int ibge, String regiao) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
        this.regiao = regiao;
    }

    public String getRegiao() {
        return regiao;
    }

    public int getIbge() {
        return ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaisculo() {
        return nome.toUpperCase();
    }
    public String getSiglaMinusculo(){
        return sigla.toLowerCase();
    }
}
