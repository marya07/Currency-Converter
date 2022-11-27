package org.XChangeIt.translation;

public enum Translator {
    //Declares English phrases to be used
    //The other phrases are the exact duplicates of the English phrases, only translated into that langauge
    ENGLISH("ENGLISH", "Welcome!", "Help",  "Convert",
            "I agree to being charged a fee of 2.2% to convert this currency.",
            "This is used to convert currencies. Select which currencies you would like to convert " +
                    "from and then input the amount you would like to convert.", "Your Transaction Information: ",
                    "Transaction Processed: ", "Currency Deposited: ",
                    "Currency Withdrawn: ", "Thank you for doing business with us!",
                    "Would you like to convert more?", "Fee Charged: ", "Error",
            "Please agree to terms in order to proceed.", "Transaction Summary",
            "Transaction Successful!"),
    //Declares Chinese phrases to be used
    CHINESE("中国人", "欢迎！!", "帮助", "兑换",
            "我同意收取 2.2% 的费用以转换此货币。", "这用于转换货币。 选择您要转换的货币，" +
            "然后输入您要转换的金额。", "您的交易信息：",
            "交易处理： ", "存入货币： ",
            "提取货币： ", "感谢您与我们开展业务！",
            "您想转换更多吗？", "收费： ", "错误",
            "请同意条款以便继续。", "交易概要",
            "交易成功！"),
    //Declares French phrases to be used
    FRENCH("FRANÇAIS", "Bienvenu!", "Aider",  "Convertir",
            "J'accepte de payer des frais de 2,2% pour convertir cette devise.",
            "Ceci est utilisé pour convertir les devises. Sélectionnez les devises à partir desquelles vous " +
                    "souhaitez convertir, puis saisissez le montant que vous souhaitez convertir.",
            "Vos informations de transaction: ",
            "Transaction traitée: ", "Monnaie déposée: ",
            "Devise retirée: ", "Merci de faire des affaires avec nous!",
            "Souhaitez-vous en convertir davantage?", "Frais facturés: ", "Erreur",
            "Veuillez accepter les conditions afin de continuer.", "récapitulatif des transactions",
            "Opération réussie!"),
    //Declares German phrases to be used
    GERMAN("DEUTSCH", "Willkommen!", "Hilfe",
            "Konvertieren", "Ich stimme zu, dass für die Umrechnung dieser Währung " +
            "eine Gebühr von 2,2 % erhoben wird.", "Dies wird verwendet, um Währungen umzurechnen. " +
            "Wählen Sie die Währungen aus, die Sie umrechnen möchten, und geben Sie dann den Betrag ein, den Sie " +
            "umrechnen möchten.", "Ihre Transaktionsinformationen: ",
            "Transaktion verarbeitet: ", "Eingezahlte Währung: ",
            "Abgehobene Währung: ", "Vielen Dank, dass Sie mit uns Geschäfte machen!",
            "Möchten Sie mehr konvertieren?", "Gebührenpflichtig: ", "Fehler",
            "Bitte stimmen Sie den Bedingungen zu, um fortzufahren.", "Transaktions zusammenfassung",
            "Transaktion Erfolgreich!"),
    //Declares Japanese phrases to be used
    JAPANESE("日本", "いらっしゃいませ！", "日本", "変換",
            "この通貨の換算には 2.2% の手数料がかかることに同意します。", "これは、通貨を変換するために使用されます。 " +
            "変換元の通貨を選択し、変換したい金額を入力します。", "取引情報: ",
            "処理されたトランザクション: ", "入金通貨: ",
            "引き出した通貨: ", "お取引ありがとうございました！",
            "もっと変換しますか？", "手数料：", "エラー",
            "続行するには、条件に同意してください。", "取引概要",
            "取引成功！"),
    //Declares Portuguese phrases to be used
    PORTUGUESE("PORTUGUÊS", "Bem-vindo!", "Ajuda",
            "Converter", "Concordo que há uma taxa de 2,2% para converter " +
            "esta moeda.", "Isso é usado para converter moedas. Selecione de quais moedas você gostaria de " +
            "converter e insira o valor que gostaria de converter.", "Suas informações de transação: ",
            "Transação processada: ", "Moeda depositada: ",
            "Moeda retirada: ", "Agradeço a você por fazer negócios conosco!",
            "Gostaria de converter mais?", "Taxa cobrada: ", "Erro",
            "Concorde com os termos para prosseguir.", "Resumo transação",
            "Transação realizada com sucesso!"),
    //Declares Russian phrases to be used
    RUSSIAN("РУССКИЙ", "Добро пожаловать!", "Помощь",
            "Конвертировать", "Я согласен с комиссией в размере 2,2% за конвертацию " +
            "этой валюты.", "Это используется для конвертации валют. Выберите, из какой валюты вы хотите " +
            "конвертировать, а затем введите сумму, которую хотите конвертировать.", "Your Transaction Information: ",
            "Транзакция обработана: ", "Валюта депозита: ",
            "Снятая валюта: ", "Спасибо за сотрудничество с нами!",
            "Хотите конвертировать больше?", "Взимаемая плата: ", "Ошибка",
            "Пожалуйста, примите условия, чтобы продолжить.", "Сводка транзакции",
            "Транзакция прошла успешно!"),
    //Declares Spanish phrases to be used
    SPANISH("ESPAÑOL", "¡Bienvenidos!", "Ayuda",  "Convertir",
            "Acepto que se me cobre una tarifa del 2,2% para convertir esta moneda.", "Esto se " +
            "utiliza para convertir monedas. Seleccione de qué monedas le gustaría convertir y luego ingrese la cantidad " +
            "que le gustaría convertir.", "Su información de transacción: ",
            "Transacción procesada: ", "Moneda depositada: ",
            "Moneda retirada: ", "¡Gracias por hacer negocios con nosotros!",
            "¿Te gustaría convertir más?", "Tarifa cobrada: ", "Error",
            "Acepte los términos para continuar.", "Resumen de Transacciones",
            "¡Transacción exitosa!");

    private final String language;                  //String to hold the text for the language in a language
    private final String greetingLabelText;         //String to hold the text for the greeting label button title in a language
    private final String helpButtonText;            //String to hold the text for the  help button in a language
    private final String convertButtonText;         //String to hold the text for the convert button in a language
    private final String termsBoxText;              //String to hold the text for the terms box  in a language
    private final String helpMessage;               //String to hold the help message in a language
    private final String summaryText;               //String to hold the summary text in a language
    private final String transactionProcessed;      //String to hold the transaction processed in a language
    private final String currencyDeposited;         //String to hold the currency deposited in a language
    private final String currencyWithdrawn;         //String to hold the currency withdrawn in a language
    private final String feeCharged;                //String to hold the fee charged in a language
    private final String thanksMessage;             //String to hold the thanks message in a language
    private final String repeatText;                //String to hold the repeat text in a language
    private final String errorText;                 //String to hold the error text in a language
    private final String errorMessage;              //String to hold the error message in a language
    private final String successMessage;            //String to hold the success message in a language
    private final String summaryTitle;              //String to hold the summary title in a language

    //Creates member elements of each translator object

    /**
     * Initializes member variables of the object. Each is in the specific language
     * @param language  the language of the translation
     * @param greetingLabelTextText the text for the greeting label
     * @param helpButtonTextText help button text
     * @param convertButtonTextText convert button text
     * @param termsBoxText terms in the specific language
     * @param helpMessage help message in the specific language
     * @param summaryText summary text in the specific language
     * @param transactionProcessed variable holding the transaction processed
     * @param currencyDeposited double that has the
     * @param currencyWithdrawn variable holding the currency withdrawn
     * @param thanksMessage message displayed after thanks is done
     * @param repeatText text asking if the user wishes to repeat the transaction
     * @param feeCharged variable holding the fee charged
     * @param errorText variable holding the error text
     * @param errorMessage holds the error message
     * @param summaryTitle holds the summary title
     * @param successMessage holds the message for a successful transaction
     */
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

    /**
     * Function to get the translator by the value
     * @param value value that will determine the language
     * @return translator if valid, translation found and return the specific translator, null otherwise
     */
    public static Translator getTranslatorByValue(String value){
        for(Translator translator: Translator.values()){
            if(translator.language.equals(value)){
                return translator;
            }
        }
        return null;
    }

    /**
     * Function to return the language string
     * @return language String holding the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Function to get the text for the greeting
     * @return greetingLabelText text for the greeting label
     */
    public String getGreetingLabelText() {
        return greetingLabelText;
    }

    /**
     * Function to get the text for the help button
     * @return helpButtonText text for the help button
     */
    public String getHelpButtonText() {
        return helpButtonText;
    }

    /**
     * Function to get the text for the convert button
     * @return convertButtonText variable that is the text for the convert button
     */
    public String getConvertButtonText() {
        return convertButtonText;
    }

    /**
     * Function to get the text for the terms box
     * @return termsBoxText that is the text for the terms box
     */
    public String getTermsBoxText() {
        return termsBoxText;
    }

    /**
     * Function to get the text for the help message
     * @return helpMessage that is the text for the help message
     */
    public String getHelpMessage() {
        return helpMessage;
    }

    /**
     * Function to get the text for the summary
     * @return summaryText that is the text for the summary statement
     */
    public String getSummaryText() {
        return summaryText;
    }

    /**
     * Function to get the text for the transaction processed
     * @return transactionProcessed that is the text for the transaction processed
     */
    public String getTransactionProcessed() {
        return transactionProcessed;
    }

    /**
     * Function to get the text for the currency deposited processed
     * @return currencyDeposited that is the currency deposited
     */
    public String getCurrencyDeposited() {
        return currencyDeposited;
    }

    /**
     * Function to get the text for the withdrawn currency
     * @return currencyWithdrawn that is the currency withdrawn
     */
    public String getCurrencyWithdrawn() {
        return currencyWithdrawn;
    }

    /**
     * Function to get the text for the thanks message
     * @return thanksMessage that is thanking the user for their business
     */
    public String getThanksMessage() {
        return thanksMessage;
    }

    /**
     * Function to get the text for repeating transactions
     * @return repeatText that is the text prompting to repeat
     */
    public String getRepeatText() {
        return repeatText;
    }

    /**
     * Function to get the fee charged for the service
     * @return feeCharged that is the fee charged for the service
     */
    public String getFeeCharged() {
        return feeCharged;
    }

    /**
     * Function to get the text for an error
     * @return errorText that is the title text for an error
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Function to get the text for error messages
     * @return errorMessage when there is an error
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Function to get the text for a successful transaction
     * @return successMessage that is text for a successful message
     */
    public String getSuccessMessage() {
        return successMessage;
    }

    /**
     * Function to get the text that summarizes the transaction
     * @return summaryTitle that is the title text for the summary
     */
    public String getSummaryTitle() {
        return summaryTitle;
    }
}