package pow2;

public class misere_nums {
    
    public static boolean misereNim(int[] heaps) {
        boolean allOnes = true;
        int xor = 0;
        
        for (int h : heaps) {
            if (h != 1) allOnes = false;
            xor ^= h;
        }
        
        if (allOnes) {
            // if all heaps are 1 → first wins iff number of heaps is even
            return heaps.length % 2 == 0;
        }
        
        // otherwise normal Nim rule
        return xor != 0;
    }

    public static void main(String[] args) {
        System.out.println(misereNim(new int[]{3, 4, 5})); // true
        System.out.println(misereNim(new int[]{1, 1, 1})); // false
        System.out.println(misereNim(new int[]{1, 1, 2})); // true
        System.out.println(misereNim(new int[]{1, 1, 1, 1})); // true
    }
}


