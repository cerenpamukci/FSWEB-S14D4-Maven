package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    // Troll sınıfı constructor metodu
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    // bleed metodu: Troll'ün saldırdığında kanatma hasarı
    @Override
    public double bleed() {
        return getDamage() * 0.25; // Hasarın %25'ini dön
    }

    // poison metodu: Troll'ün saldırdığında zehirleme hasarı
    @Override
    public double poison() {
        return getDamage() * 0.3; // Hasarın %30'unu dön
    }

    // attack metodu: Normal hasar + kanatma hasarı + zehirleme hasarı toplamı
    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }

    // Troll'ün bilgilerini göstermek için ek bir metot
    public void showDetails() {
        System.out.println("Troll Name: " + getName());
        System.out.println("Hit Points: " + getHitPoints());
        System.out.println("Damage: " + getDamage());
        System.out.println("Bleed Damage: " + bleed());
        System.out.println("Poison Damage: " + poison());
        System.out.println("Total Attack Damage: " + attack());
    }
}