package pasport;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PassportList {
    private final Set<Passport> passports = new HashSet<>();


    public void addPassport(Passport passport) {
        this.passports.add(passport);
    }

    public Passport findByNumber(int number) {  // найти паспорт по номеру
        for (Passport passport : passports) {
            if (passport.getNumber() == number) {
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return " Паспорт" + passports;
    }
}
