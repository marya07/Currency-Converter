package org.XChangeIt.model;

import java.util.ArrayList;
import java.util.Arrays;

public enum Translator {
    ENGLISH("ENGLISH", "Help", "Welcome!", "Convert", "I agree to being charged a fee of 2.2% to convert this currency."),
    CHINESE("中国人", "帮助", "欢迎！!", "兑换", "我同意收取 2.2% 的费用以转换此货币。"),
    FRENCH("FRANÇAIS", "Aider", "Bienvenu!", "Convertir", "J'accepte de payer des frais de 2,2% pour convertir cette devise."),
    GERMAN("DEUTSCH", "Hilfe", "Willkommen!", "Konvertieren", "Ich stimme zu, dass für die Umrechnung dieser Währung eine Gebühr von 2,2 % erhoben wird."),
    JAPANESE("日本", "日本", "いらっしゃいませ！", "変換", "この通貨の換算には 2.2% の手数料がかかることに同意します。"),
    PORTUGUESE("PORTUGUÊS", "Ajuda", "Bem-vindo!", "Converter", "Concordo que há uma taxa de 2,2% para converter esta moeda."),
    RUSSIAN("РУССКИЙ", "Помощь", "Добро пожаловать!", "Конвертировать", "Я согласен с комиссией в размере 2,2% за конвертацию этой валюты."),
    SPANISH("ESPAÑOL", "Ayuda", "¡Bienvenidos!", "Convertir", "Acepto que se me cobre una tarifa del 2,2% para convertir esta moneda.");

    Translator(String language, String help, String greeting, String convert, String fee) {
        this.language = language;
        this.help = help;
        this.greeting = greeting;
        this.convert = convert;
        this.fee = fee;
    }

    public static final Translator getTranslatorByValue(String value){
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

    public String getHelp() {
        return help;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getConvert() {
        return convert;
    }

    public String getFee() {
        return fee;
    }
    public String helpMessage(){
        return "Help Text Goes Here";
    }

    private final String language;
    private final String help;
    private final String greeting;
    private final String convert;
    private final String fee;
}