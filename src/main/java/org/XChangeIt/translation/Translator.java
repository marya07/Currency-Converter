package org.XChangeIt.translation;

public enum Translator {
    ENGLISH("ENGLISH", "Welcome!", "Help",  "Convert",
            "I agree to being charged a fee of 2.2% to convert this currency.",
            "This is used to convert currencies. Select which currencies you would like to convert " +
                    "from and then input the amount you would like to convert.", "Your Transaction Information: ",
                    "Transaction Processed: ", "Currency Deposited: ",
                    "Currency Withdrawn: ", "Thank you for doing business with us!",
                    "Would you like to convert more?", "Fee Charged: ", "Error",
            "Please agree to terms inorder to proceed.", "Transaction Summary",
            "Transaction Successful!"),

    CHINESE("中国人", "欢迎！!", "帮助", "兑换",
            "我同意收取 2.2% 的费用以转换此货币。", "这用于转换货币。 选择您要转换的货币，" +
            "然后输入您要转换的金额。", "Your Transaction Information: ",
            "Transaction Processed: ", "Currency Deposited: ",
            "Currency Withdrawn: ", "Thank you for doing business with us!",
            "Would you like to convert more?", "Fee Charged: ", "Error",
            "Please agree to terms inorder to proceed.", "Transaction Summary",
            "Transaction Successful!"),

    FRENCH("FRANÇAIS", "Bienvenu!", "Aider",  "Convertir",
            "J'accepte de payer des frais de 2,2% pour convertir cette devise.",
            "Ceci est utilisé pour convertir les devises. Sélectionnez les devises à partir desquelles vous " +
                    "souhaitez convertir, puis saisissez le montant que vous souhaitez convertir.",
            "Your Transaction Information: ",
            "Transaction Processed: ", "Currency Deposited: ",
            "Currency Withdrawn: ", "Thank you for doing business with us!",
            "Would you like to convert more?", "Fee Charged: ", "Error",
            "Please agree to terms inorder to proceed.", "Transaction Summary",
            "Transaction Successful!"),

    GERMAN("DEUTSCH", "Willkommen!", "Hilfe",
            "Konvertieren", "Ich stimme zu, dass für die Umrechnung dieser Währung " +
            "eine Gebühr von 2,2 % erhoben wird.", "Dies wird verwendet, um Währungen umzurechnen. " +
            "Wählen Sie die Währungen aus, die Sie umrechnen möchten, und geben Sie dann den Betrag ein, den Sie " +
            "umrechnen möchten.", "Your Transaction Information: ",
            "Transaction Processed: ", "Currency Deposited: ",
            "Currency Withdrawn: ", "Thank you for doing business with us!",
            "Would you like to convert more?", "Fee Charged: ", "Error",
            "Please agree to terms inorder to proceed.", "Transaction Summary",
            "Transaction Successful!"),

    JAPANESE("日本", "いらっしゃいませ！", "日本", "変換",
            "この通貨の換算には 2.2% の手数料がかかることに同意します。", "これは、通貨を変換するために使用されます。 " +
            "変換元の通貨を選択し、変換したい金額を入力します。", "Your Transaction Information: ",
            "Transaction Processed: ", "Currency Deposited: ",
            "Currency Withdrawn: ", "Thank you for doing business with us!",
            "Would you like to convert more?", "Fee Charged: ", "Error",
            "Please agree to terms inorder to proceed.", "Transaction Summary",
            "Transaction Successful!"),

    PORTUGUESE("PORTUGUÊS", "Bem-vindo!", "Ajuda",
            "Converter", "Concordo que há uma taxa de 2,2% para converter " +
            "esta moeda.", "Isso é usado para converter moedas. Selecione de quais moedas você gostaria de " +
            "converter e insira o valor que gostaria de converter.", "Your Transaction Information: ",
            "Transaction Processed: ", "Currency Deposited: ",
            "Currency Withdrawn: ", "Thank you for doing business with us!",
            "Would you like to convert more?", "Fee Charged: ", "Error",
            "Please agree to terms inorder to proceed.", "Transaction Summary",
            "Transaction Successful!"),

    RUSSIAN("РУССКИЙ", "Добро пожаловать!", "Помощь",
            "Конвертировать", "Я согласен с комиссией в размере 2,2% за конвертацию " +
            "этой валюты.", "Это используется для конвертации валют. Выберите, из какой валюты вы хотите " +
            "конвертировать, а затем введите сумму, которую хотите конвертировать.", "Your Transaction Information: ",
            "Transaction Processed: ", "Currency Deposited: ",
            "Currency Withdrawn: ", "Thank you for doing business with us!",
            "Would you like to convert more?", "Fee Charged: ", "Error",
            "Please agree to terms inorder to proceed.", "Transaction Summary",
            "Transaction Successful!"),

    SPANISH("ESPAÑOL", "¡Bienvenidos!", "Ayuda",  "Convertir",
            "Acepto que se me cobre una tarifa del 2,2% para convertir esta moneda.", "Esto se " +
            "utiliza para convertir monedas. Seleccione de qué monedas le gustaría convertir y luego ingrese la cantidad " +
            "que le gustaría convertir.", "Your Transaction Information: ",
            "Transaction Processed: ", "Currency Deposited: ",
            "Currency Withdrawn: ", "Thank you for doing business with us!",
            "Would you like to convert more?", "Fee Charged: ", "Error",
            "Please agree to terms inorder to proceed.", "Transaction Summary",
            "Transaction Successful!");

    private final String language;
    private final String greetingLabelText;
    private final String helpButtonText;
    private final String convertButtonText;
    private final String termsBoxText;
    private final String helpMessage;
    private final String summaryText;
    private final String transactionProcessed;
    private final String currencyDeposited;
    private final String currencyWithdrawn;
    private final String feeCharged;
    private final String thanksMessage;
    private final String repeatText;
    private final String errorText;
    private final String errorMessage;
    private final String successMessage;
    private final String summaryTitle;

    Translator(String language, String greetingLabelTextText, String helpButtonTextText, String convertButtonTextText,
               String termsBoxText, String helpMessage,   String summaryText, String transactionProcessed,
               String currencyDeposited, String currencyWithdrawn, String thanksMessage, String repeatText,
               String feeCharged, String errorText, String errorMessage, String summaryTitle, String successMessage) {

        this.language = language;
        this.greetingLabelText = greetingLabelTextText;
        this.helpButtonText = helpButtonTextText;
        this.convertButtonText = convertButtonTextText;
        this.termsBoxText = termsBoxText;
        this.helpMessage = helpMessage;
        this.summaryText = summaryText;
        this.transactionProcessed = transactionProcessed;
        this.currencyDeposited = currencyDeposited;
        this.currencyWithdrawn = currencyWithdrawn;
        this.thanksMessage = thanksMessage;
        this.repeatText = repeatText;
        this.feeCharged = feeCharged;
        this.errorText = errorText;
        this.errorMessage = errorMessage;
        this.summaryTitle = summaryTitle;
        this.successMessage = successMessage;
    }

    public static Translator getTranslatorByValue(String value){
        for(Translator translator: Translator.values()){
            if(translator.language.equals(value)){
                return translator;
            }
        }
        return null;
    }

    public String getLanguage() {
        return language;
    }

    public String getGreetingLabelText() {
        return greetingLabelText;
    }

    public String getHelpButtonText() {
        return helpButtonText;
    }

    public String getConvertButtonText() {
        return convertButtonText;
    }

    public String getTermsBoxText() {
        return termsBoxText;
    }

    public String getHelpMessage() {
        return helpMessage;
    }

    public String getSummaryText() {
        return summaryText;
    }

    public String getTransactionProcessed() {
        return transactionProcessed;
    }

    public String getCurrencyDeposited() {
        return currencyDeposited;
    }

    public String getCurrencyWithdrawn() {
        return currencyWithdrawn;
    }

    public String getThanksMessage() {
        return thanksMessage;
    }

    public String getRepeatText() {
        return repeatText;
    }

    public String getFeeCharged() {
        return feeCharged;
    }

    public String getErrorText() {
        return errorText;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public String getSummaryTitle() {
        return summaryTitle;
    }
}