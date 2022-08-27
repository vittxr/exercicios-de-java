public class VerificaCPF {
    public static int calcCpfDigits(int iValue, String cpf) {
        int j = 0;
        int result = 0;

        for (int i = iValue; i >= 2; i--) {
            result += Integer.parseInt(String.valueOf(cpf.charAt(j))) * i;
            j++;
        }

        return result;
    }

    public static String checkCpf(String cpf) {
        String formattedCPF = cpf.replace(".", "")
                                 .replace("-", "");
    
        int firstDigitResult = calcCpfDigits(10, formattedCPF); 
        boolean isFirstDigitValid = (firstDigitResult * 10 % 11) == Integer.parseInt(String.valueOf(formattedCPF.charAt(9)));

        if (isFirstDigitValid) {
            // checa o segundo digito: 
            int secondDigitResult = calcCpfDigits(11, formattedCPF); 

            boolean isSecondDigitValid = (secondDigitResult * 10 % 11) == Integer.parseInt(String.valueOf(formattedCPF.charAt(10)));

            if (isSecondDigitValid) {
                return "O CPF é válido";
            }
        }
  
        return "O CPF é inválido";
    }

    public static void main(String[] args) {
        String cpf = "529.982.247-25";
        System.out.println(VerificaCPF.checkCpf(cpf));
    }
}
