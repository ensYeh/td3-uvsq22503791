package fr.uvsq.cprog.collex;

import java.util.Objects;

public class AdresseIP {
    private final String ip;

    public AdresseIP(String ip) {
        if (!ip.matches(
                "^((25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.|$)){4}$")) {
            throw new IllegalArgumentException("Adresse IP invalide : " + ip);
        }
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdresseIP)) return false;
        AdresseIP adresseIP = (AdresseIP) o;
        return ip.equals(adresseIP.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip);
    }
}
