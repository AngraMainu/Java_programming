package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {

    @Override
    public void breakPassword(int sizeOfPassword) {
        char[] chars = getCharacters();
        char[] pass = new char[sizeOfPassword];
        int pos = 0;
        pass = attacker(pass, chars, pos);
    }

    public char[] attacker(char[] pass, char[] chars, int pos) {
        char [] newPass;

        if (tryOpen(pass)) {
            return pass;
        }

        if(pass.length == pos){
            return null;
        }

        for (char aChar : chars) {
            pass[pos] = aChar;
            newPass = attacker(pass, chars, pos + 1);
            if (newPass != null) {
                return newPass;
            }
        }
        return null;
    }
}
