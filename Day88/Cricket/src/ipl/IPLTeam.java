package ipl;

public class IPLTeam {
    String name;
    public String brandAmbassador;
    public double netWorth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandAmbassador() {
        return brandAmbassador;
    }

    public void setBrandAmbassador(String brandAmbassador) {
        this.brandAmbassador = brandAmbassador;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    @Override
    public String toString() {
        return "IPLTeam{" +
                "name='" + name + '\'' +
                ", brandAmbassador='" + brandAmbassador + '\'' +
                ", netWorth=" + netWorth +
                '}';
    }
}
