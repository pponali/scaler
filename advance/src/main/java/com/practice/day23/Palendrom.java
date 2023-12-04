package com.practice.day23;

/**
 * @author prakashponali
 * @Date 11/10/23
 */
public class Palendrom {

    public static void main(String[] args) {
        Palendrom palendrom = new Palendrom();
       System.out.println(palendrom.solve("mnaschgziwincvcrhegtkkgzuewasvstiogqaijvtvikjjivatyqbnsrnfcrhxlkkrrqrmzemiqbujbktdnejobxtcjiibcfynrfxbbqwujyleetwwalbuewgewkdrefcdptqgpqhqvguniapbdzdxexeealxmtbmlsdihyllmnmltghyetghrtmpimqepumuzvkdmxvyoweexxckmyqtirjnebodjmuzozmvypdcalffowunzrlflvmimxhemvlhobeenpcvynchlxpsdvlmeddahnvkspuqhgrxdukrhtbtlpxyblucxuyoowsxgtqeiotylvonaublmozlvwsphfilxfncegpleebaiufdjmpiolgdbfcshbwjchuxumyxhhrujifbcehsniqpghdztvztxvliztiqzwaktqohpntxeyfeaijldzhnsyvhjixlymtmrfvzlqgdomawrfddcagjagvcfhbyqgixyqbbpyjijeviyhwrignduetolptfyvmklmdrxqvrdnwssvgujqfwukneddqdvvqxxmuhtxuiufbqxswstgrykpoeiizmbpoturgrnvsshhzoppyktljqxxuhcdfsmesaimxicxfslnfagdfaoczbhivhxmotzbpulduuczfyeijkkcwmqqtrqstwiqmkatyjotoexkeesprwzfxwzshwlqfssryxxvybnrxdiuusvnnlfabkpynsakpnftjqhecuwmyqgwhyrtudmkfcphnnyxqxzxbucfewihqmjjnblrmyertspotzfgzvabnhcxklqdlbtvvqwynenkkhxcjsndltankzkmrkknbkxjqzabatkcdvodhzzmqqcfwshhufezzddzrfldwxylaylpfqpiczfmyymfzcipqfplyalyxwdlfrzddzzefuhhswfcqqmzzhdovdcktabazqjxkbnkkrmkzknatldnsjcxhkknenywqvvtbldqlkxchnbavzgfztopstreymrlbnjjmqhiwefcubxzxqxynnhpcfkmdutryhwgqymwucehqjtfnpkasnypkbaflnnvsuuidxrnbyvxxyrssfqlwhszwxfzwrpseekxeotojytakmqiwtsqrtqqmwckkjieyfzcuudlupbztomxhvihbzcoafdgafnlsfxcixmiasemsfdchuxxqjltkyppozhhssvnrgrutopbmziieopkyrgtswsxqbfuiuxthumxxqvvdqddenkuwfqjugvsswndrvqxrdmlkmvyftploteudngirwhyivejijypbbqyxigqybhfcvgajgacddfrwamodgqlzvfrmtmylxijhvysnhzdljiaefyextnphoqtkawzqitzilvxtzvtzdhgpqinshecbfijurhhxymuxuhcjwbhscfbdgloipmjdfuiabeelpgecnfxlifhpswvlzomlbuanovlytoieqtgxswooyuxculbyxpltbthrkudxrghqupskvnhaddemlvdspxlhcnyvcpneebohlvmehxmimvlflrznuwofflacdpyvmzozumjdobenjritqymkcxxeewoyvxmdkvzumupeqmipmtrhgteyhgtlmnmllyhidslmbtmxlaeexexdzdbpainugvqhqpgqtpdcferdkwegweublawwteelyjuwqbbxfrnyfcbiijctxbojendtkbjubqimezmrqrrkklxhrcfnrsnbqytavijjkivtvjiaqgoitsvsaweuzgkktgehrcvcniwizghcsnm"));
    }

        public boolean solve(String A) {
            if(A.length() % 2 == 0)
                return isPalindrome(A, A.length()/2 - 1, A.length()/2);
            else {
                return isPalindrome(A, A.length()/2 - 1, A.length()/2 + 1);
            }

        }
        boolean isPalindrome(String A, int left, int right){

            if(left == 0 && right == A.length() -1){
                if(A.charAt(left) == A.charAt(right))
                    return  true;
                else
                    return false;
            } else {
                if (A.charAt(left) == A.charAt(right))
                    return isPalindrome(A, left - 1, right + 1);
                else
                    return false;
            }

        }


}
