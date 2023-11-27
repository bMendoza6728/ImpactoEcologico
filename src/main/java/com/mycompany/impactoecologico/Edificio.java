public class Edificio implements ImpactoEcologico {
    private String localizacion;
    private String tecnologiaEcologica;
    private String materialConstruccion;

    public Edificio(String localizacion, String tecnologiaEcologica, String materialConstruccion) {
        this.localizacion = localizacion;
        this.tecnologiaEcologica = tecnologiaEcologica;
        this.materialConstruccion = materialConstruccion;
    }

    @Override
    public double calcularImpactoEcologico() {
        // Lógica simplificada para el cálculo del impacto ecológico
        double impacto = 0;
        // Asumir valores hipotéticos para la lógica de cálculo
        impacto += "madera".equals(materialConstruccion) ? 100 : 200;
        impacto -= "Tecnología sostenible".equals(tecnologiaEcologica) ? 50 : 0;
        return impacto;
    }

    @Override
    public String getIdentificacion() {
        return "Edificio en " + localizacion;
    }
}

