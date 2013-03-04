/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shikanga.cms.model.entities;

import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Based on <A href="http://www.iso.org/iso/iso-3166-1_decoding_table">ISO
 * Standard 3166-1</A>
 *
 * @author shikanga
 *
 */
public enum Country {

    AFG("AF", "AFGHANISTAN", "fa", "AFGHA")/*fa, ps*/,
    ALB("AL", "ALBANIA", "sq", "ALBAN"),
    DZA("DZ", "ALGERIA", "ar", "ALGER"),
    ASM("AS", "AMERICAN SAMOA", "sm", "AMSA"),
    AND("AD", "ANDORRA", "ca", "ANDOR"),
    AGO("AO", "ANGOLA", "pt", "ANGOL"),
    AIA("AI", "ANGUILLA", "en"),
    ATA("AQ", "ANTARCTICA", "no")/*en, fr, es, no, nn*/,
    ATG("AG", "ANTIGUA & BARBUDA", new String[]{"ANTIGUA AND BARBUDA"}, "en", "ANTIG"),
    ARG("AR", "ARGENTINA", "es", "ARGEN"),
    ARM("AM", "ARMENIA", "hy", "ARMEN"),
    ABW("AW", "ARUBA", "nl", "ARUBA"),
    AUS("AU", "AUSTRALIA", "en", "AU"),
    AUT("AT", "AUSTRIA", "de", "AUSTR"),
    AZE("AZ", "AZERBAIJAN", "az", "AZERB"),
    AZO("ZZ", "AZORES", null), // Added - to be verified
    BHS("BS", "BAHAMAS", "en", "BAHAM"),
    BHR("BH", "BAHRAIN", "ar", "BAHRA"),
    BAL("ZZ", "BALEARIC ISLANDS", null), // Added - to be verified
    BGD("BD", "BANGLADESH", "bn", "BANGL"),
    BRB("BB", "BARBADOS", "en", "BARBA"),
    BLR("BY", "BELARUS", "be", "BELAR"),
    BEL("BE", "BELGIUM", "de", "BELGI")/*de, fr, nl, wa*/,
    BLZ("BZ", "BELIZE", "en", "BELIZ"),
    BEN("BJ", "BENIN", "fr", "BENIN"),
    BMU("BM", "BERMUDA", "en", "BERMU"),
    BTN("BT", "BHUTAN", "dz", "BHUTA"),
    BOL("BO", "BOLIVIA", "es", "BOLIV"),
    BIH("BA", "BOSNIA-HERZEGOVINA", new String[]{"BOSNIA AND HERZEGOWINA", "BOSNIA-HERCEGOVINA"}, "sr", "BOSNI"),
    BWA("BW", "BOTSWANA", "en", "BOTSW"),
    BVT("BV", "BOUVET ISLAND", null)/* uninhabited */,
    BRA("BR", "BRAZIL", "pt", "BRAZI"),
    BPO("ZZ", "BRITISH FORCES P.O.", new String[]{"British Forces P.O.", "BRITISH FORCES P O"}, "en"), // Added for MASS
    IOT("IO", "BRITISH INDIAN OCEAN TERRITORIES", new String[]{"TERRITORY"}, "en"),
    BRN("BN", "BRUNEI", new String[]{"BRUNEI DARUSSLAM"}, "ms", "BRUNE"),
    BGR("BG", "BULGARIA", "bg", "BULGA"),
    BFA("BF", "BURKINA FASO", "fr", "BURKI"),
    BDI("BI", "BURUNDI", "fr", "BURUN"),
    KHM("KH", "CAMBODIA", "km", "CAMBO"),
    CMR("CM", "CAMEROON", "fr", "CAMER")/*en, fr*/,
    CAN("CA", "CANADA", "en", "CANAD")/*en, fr*/,
    CAY("ZZ", "CANARY ISLANDS", null), // Requires verification
    CPV("CV", "CAPE VERDE ISLANDS", new String[]{"CAPE VERDE ISLANDS"}, "pt", "CAPE"),
    CAR("ZZ", "CAROLINE ISLANDS", (String) null, "CAROL"), // Requires verification
    CYM("KY", "CAYMAN ISLANDS", "en", "CAYMA"),
    CAF("CF", "CENTRAL AFRICAN REPUBLIC", "fr", "CENTR"),
    TCD("TD", "CHAD", "fr", "CHAD")/*fr, ar*/,
    CHC("ZZ", "CHECHNIA", null), // Added - to be confirmed
    CHL("CL", "CHILE", "es", "CHILE"),
    CHN("CN", "CHINA", "zh", "CHINA"),
    CXR("CX", "CHRISTMAS ISLAND (INDIAN OCEAN)", new String[]{"CHRISTMAS ISLAND"}, "en", "CHRIS"),
    CCK("CC", "COCOS ISLAND (KEELING ISLAND)", new String[]{"COCOS (KEELING) ISLANDS"}, "en", "COCOS")/*ms, en*/,
    COL("CO", "COLOMBIA", "es", "COLOM"),
    COM("KM", "COMOROS", "fr", "COMOR")/*ar, fr*/,
    COG("CG", "CONGO", "fr", "CONGO"),
    COD("CD", "CONGO DEMOCRATIC REPUBLIC", new String[]{"CONGO, THE DEMOCRATIC REPUBLIC OF THE"}, "fr", "DRCON"),
    COK("CK", "COOK ISLANDS", "en", "COOK")/*en, mi*/,
    COR("ZZ", "CORSICA", null), // Added - to be confirmed
    CRI("CR", "COSTA RICA", "es", "COSTA"),
    CIV("CI", "COTE D'IVOIRE", "fr"),
    HRV("HR", "CROATIA", new String[]{"CROATIA (local name: Hrvatska)"}, "hr", "CROAT"),
    CUB("CU", "CUBA", "es", "CUBA"),
    CYP("CY", "CYPRUS", "el", "CYPRU")/*el, tr*/,
    CZE("CZ", "CZECHOSLOVAKIA", new String[]{"REPUBLIC OF SLOVAKIA"}, "cs"),
    CZZ("ZZ", "CZECH REPUBLIC", new String[]{"THE CZECH REPUBLIC"}, "CZECH"), // Added - to be confirmed
    DAG("ZZ", "DAGESTAN", null), // Added - to be confirmed
    DNK("DK", "DENMARK", "da", "DENMA")/*da, en*/,
    DJI("DJ", "DJIBOUTI", "fr", "DJIBO")/*fr, ar*/,
    DMA("DM", "DOMINICA", "en", "DOMWI"),
    DOM("DO", "DOMINICAN REPUBLIC", "es", "DOMRE"),
    TMP("TL", "EAST TIMOR", "pt", "PORT"),
    ECU("EC", "ECUADOR", "es", "ECUAD"),
    EGY("EG", "EGYPT", "ar", "EGYPT"),
    SLV("SV", "EL SALVADOR", "es", "EL SA"),
    GNQ("GQ", "EQUATORIAL GUINEA", "fr", "EQUAT")/*es, fr*/,
    ERI("ER", "ERITREA", "ti", "ERITR"),
    EST("EE", "ESTONIA", "et", "ESTON"),
    ETH("ET", "ETHIOPIA", "am", "ETHIO")/*am, ti*/,
    FLK("FK", "FALKLAND ISLANDS & DEPENDENCIES", new String[]{"FALKLAND ISLANDS (MALVINAS)"}, "en", "FALKL"),
    FRO("FO", "FAROE ISLANDS", "fo", "FAROE"),
    FJI("FJ", "FIJI", "fj", "FIJI")/*en, fj*/,
    FIN("FI", "FINLAND", "fi", "FINLA")/*fi, sv*/,
    FRA("FR", "FRANCE", "fr", "FRANC")/*br, fr, oc*/,
    FXX("FX", "FRANCE, METROPOLITAN", "fr"),
    GUF("GF", "FRENCH GUIANA", "fr", "FRGU"),
    PYF("PF", "FRENCH POLYNESIA", "fr", "FPOLY"),
    ATF("TF", "FRENCH SOUTHERN & ANTARCTIC TERRITORIES", new String[]{"FRENCH SOUTHERN TERRITORIES"}, "fr"),
    GAB("GA", "GABON", "fr", "GABON"),
    GMB("GM", "GAMBIA", "wo", "GAMBI")/*en, wo, ff*/,
    GEO("GE", "GEORGIA", "ka", "GEORG"),
    DEU("DE", "GERMANY", "de", "GERMA"),
    GHA("GH", "GHANA", "en", "GHANA"),
    GIB("GI", "GIBRALTAR", "en", "GIBRA")/*en, es, it, pt*/,
    GRC("GR", "GREECE", "el", "GREEC"),
    GRL("GL", "GREENLAND", "kl", "GREEN"),
    GRD("GD", "GRENADA", "en", "GRENA"),
    GLP("GP", "GUADELOUPE", "fr", "GUADE"),
    GUM("GU", "GUAM", "ch", "GUAM")/*en, ch*/,
    GTM("GT", "GUATEMALA", "es", "GUATA"),
    GIN("GN", "GUINEA", "fr", "RGUIN"),
    GNB("GW", "GUINEA-BISSAU", "pt", "BISS"),
    GUY("GY", "GUYANA", "en", "GUYAN"),
    HTI("HT", "HAITI", "fr", "HAITI"),
    HMD("HM", "HEARD AND MC DONALD ISLANDS", null)/* uninhabited */,
    HND("HN", "HONDURAS", "es", "HONDU"),
    HKG("HK", "HONG KONG", "zh", "HONG")/*en, zh*/,
    HUN("HU", "HUNGARY", "hu", "HUNGA"),
    ISL("IS", "ICELAND", "is", "ICELA"),
    IND("IN", "INDIA", "hi", "INDIA")/*ar, bn, en, hi, mr, ta, te*/,
    IDN("ID", "INDONESIA", "id", "INDON"),
    IRN("IR", "IRAN", new String[]{"IRAN (ISLAMIC REPUBLIC OF)"}, "fa", "IRAN"),
    IRQ("IQ", "IRAQ", "ar", "IRAQ"),
    IRL("IE", "EIRE", new String[]{"IRELAND"}, "en", "IRELA")/*en, ga*/,
    IMN("IM", "ISLE OF MAN", "en")/*en, gv*/,
    ISR("IL", "ISRAEL", "he", "ISRAE")/* eas entered as iw*/,
    ITA("IT", "ITALY", "it", "ITALY"),
    JAM("JM", "JAMAICA", "en", "JAMAI"),
    JPN("JP", "JAPAN", "ja", "JAPAN"),
    JEY("JE", "JERSEY", "en")/*en, pt*/,
    JOR("JO", "JORDAN", "ar", "JORDA"),
    KAZ("KZ", "KAZAKHSTAN", "kk", "KAZAK")/*kk, ru*/,
    KEN("KE", "KENYA", "en", "KENYA"),
    KIR("KI", "KIRIBATI", "en", "KIRIB"),
    PRK("KP", "DEMOCRATIC PEOPLE'S REPUBLIC OF KOREA", "ko"),
    KOR("KR", "REPUBLIC OF KOREA", new String[]{"KOREA, REPUBLIC OF", "NORTH KOREA", "SOUTH KOREA"}, "ko", "KOREA"),
    KOS("ZZ", "KOSOVO", null), // Added - requires verification
    KWT("KW", "KUWAIT", "ar", "KUWAI"),
    KGZ("KG", "KYRGYZSTAN", "ky", "KYRGY")/*ky, ru*/,
    LAO("LA", "LAOS", new String[]{"LAO PEOPLE'S DEMOCRATIC REPUBLIC"}, "lo", "LAOS"),
    LVA("LV", "LATVIA", "lv", "LATVI"),
    LBN("LB", "LEBANON", "ar", "LEBAN"),
    LSO("LS", "LESOTHO", "st", "LESOT")/*st, en, zu, xh*/,
    LBR("LR", "LIBERIA", "en", "LIBER"),
    LBY("LY", "LIBYA", new String[]{"LIBYAN ARAB JAMAHIRIYA"}, "ar", "LIBYA"),
    LIE("LI", "LIECHTENSTEIN", "de", "LIECH"),
    LTU("LT", "LITHUANIA", "lt", "LITHU"),
    LUX("LU", "LUXEMBOURG", "de", "LUXEM"),
    MAC("MO", "MACAO", new String[]{"MACAU"}, "zh", "MACAU"),
    MKD("MK", "MACEDONIA", new String[]{"MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF"}, "mk", "MACED"),
    MDG("MG", "MADAGASCAR", "mg", "MADAG")/*fr, mg*/,
    MAD("ZZ", "MADEIRA", (String) null, "MADEI"), // Added - requires verification
    MWI("MW", "MALAWI", "ny", "MALAW"),
    MYS("MY", "MALAYSIA", "ms", "MALAY"),
    MDV("MV", "MALDIVES", "dv", "MALDI"),
    MLI("ML", "MALI", "fr", "MALI")/*fr, bm*/,
    MLT("MT", "MALTA", "mt", "MALTA"),
    MAI("MI", "MARIANA ISLANDS", "mh", "MARIA"),
    MHL("MH", "MARSHALL ISLANDS", "mh", "MARSH"),
    MTQ("MQ", "MARTINIQUE", "fr", "MARTI"),
    MRT("MR", "MAURITANIA", "ar", "MAURA"),
    MUS("MU", "MAURITIUS", "fr", "MAURI")/*en, fr*/,
    MYT("YT", "MAYOTTE", "fr", "MAYOT"),
    MEX("MX", "MEXICO", "es", "MEXIC"),
    FSM("FM", "FEDERATED STATES OF MICRONESIA", new String[]{"MICRONESIA, FEDERATED STATES OF"}, "en"),
    MDA("MD", "MOLDOVA", new String[]{"MOLDOVA, REPUBLIC OF"}, "mo", "MOLDO")/*mo, ru*/,
    MCO("MC", "MONACO", "it", "MONAC")/*fr, it, en*/,
    MNG("MN", "MONGOLIA", "mn", "MONGO"),
    MON("ZZ", "MONTENEGRO", (String) null, "MONTE"), // Added - requires verification
    MSR("MS", "MONSERRAT", new String[]{"MONTSERRAT"}, "en", "MONTS"),
    MAR("MA", "MOROCCO", "ar", "MOROC"),
    MOZ("MZ", "MOZAMBIQUE", "pt", "MOZAM"),
    MMR("MM", "MYANMAR (BURMA)", new String[]{"MYANMAR"}, "my", "MYANM"),
    NAM("NA", "NAMIBIA", "af", "NAMIB")/*en, af, de*/,
    NRU("NR", "NAURU ISLANDS", new String[]{"NAURU"}, "na", "NAURU")/*na, en*/,
    NPL("NP", "NEPAL", "ne", "NEPAL")/*ne, en*/,
    NLD("NL", "NETHERLANDS", "nl", "NETHE"),
    ANT("AN", "NETHERLANDS ANTILLES & ARUBA", new String[]{"NETHERLANDS ANTILLES"}, "nl"),
    NCL("NC", "NEW CALEDONIA", "fr", "NEW C"),
    NZL("NZ", "NEW ZEALAND", "en", "NEW Z")/*en, mi*/,
    NIC("NI", "NICARAGUA", "es", "NICAR"),
    NER("NE", "NIGER REPUBLIC", new String[]{"NIGER"}, "fr", "NIGER"),
    NGA("NG", "NIGERIA", "ha", "NIGA")/*en, ha, yo, ig, ff*/,
    NIU("NU", "NIUE", "en", "NUIE"),
    NFK("NF", "NORFOLK ISLAND", "en", "NORFO"),
    MNP("MP", "NORTHERN MARIANA ISLANDS", "ch", "NORTH")/*ch, en*/,
    NOR("NO", "NORWAY", "no", "NORWA")/*nn, no, se*/,
    OMN("OM", "OMAN", "ar", "OMAN"),
    PAK("PK", "PAKISTAN", "ur", "PAKIS"),
    PLW("PW", "PALAU", "en"),
    PSE("PS", "PALESTINIAN TERRITORY, OCCUPIED", "ar"),
    PAN("PA", "PANAMA", "es", "PANAM"),
    PNG("PG", "PAPUA NEW GUINEA", "en", "PNG"),
    PRY("PY", "PARAGUAY", "es", "PARAG"),
    PER("PE", "PERU", "es", "PERU"),
    PHL("PH", "PHILIPPINES", "tl", "PHILI")/*en, tl*/,
    PCN("PN", "PITCAIRN ISLAND", new String[]{"PITCAIRN"}, "en", "PITCA"),
    POL("PL", "POLAND", "pl", "POLAN"),
    PRT("PT", "PORTUGAL", "pt", "PORTU"),
    PRI("PR", "PUERTO RICO", "es", "PUERT"),
    QAT("QA", "QATAR", "ar", "QATAR"),
    REU("RE", "REUNION", "fr", "REUNI"),
    ROM("RO", "ROMANIA", "ro", "RUMAN"),
    RUS("RU", "RUSSIA", new String[]{"RUSSIAN FEDERATION"}, "ru", "RUSSI"),
    RWA("RW", "RWANDA", "rw", "RWAND"),
    KNA("KN", "SAINT KITTS AND NEVIS", "en"),
    LCA("LC", "SAINT LUCIA", "en", "LUCIA"),
    VCT("VC", "SAINT VINCENT AND THE GRENADINES", "en", "VINCE"),
    WSM("WS", "SAMOA", "sm", "SAMOA")/*sm, en*/,
    SMR("SM", "SAN MARINO", "it"),
    STP("ST", "SAO TOME & PRINCIPE", new String[]{"SAO TOME & PRINCIPE"}, "pt", "SAOTO"),
    SAU("SA", "SAUDI ARABIA", "ar", "SAUDI"),
    SEN("SN", "SENEGAL", "wo", "SENEG")/*fr, wo*/,
    SRB("RS", "SERBIA", (String) null, "SERBI"), // Added - requires verification
    SYC("SC", "SEYCHELLES", "en", "SEYCH"),
    SLE("SL", "SIERRA LEONE", "en", "SIERR"),
    SGP("SG", "SINGAPORE", new String[]{"SINGAPORE REPUBLIC", "THE REPUBLIC OF SINAPORE", "REPUBLIC OF SINAPORE"}, "sg", "SINGA")/*en, sg, zh*/,
    SVK("SK", "SLOVAK REPUBLIC", new String[]{"SLOVAK (Republic)"}, "sk", "SLOVA"),
    SVN("SI", "SLOVENIA", "sl", "SLOVE"),
    SLB("SB", "SOLOMON ISLANDS", "en", "SOLOM"),
    SOM("SO", "SOMALIA", "so", "SOMAL"),
    ZAF("ZA", "SOUTH AFRICA", "en", "RSA")/*en, af, zu, xh, tn, st, ss, nr*/,
    SGS("GS", "SOUTH GEORGIA", new String[]{"SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS"}, "en"),
    SSI("SS", "SOUTH SANDWICH ISLANDS", "en"),
    ESP("ES", "SPAIN", "ca", "SPAIN")/*ca, es, eu, gl*/,
    SPI("ZZ", "SPITZBERGEN", null), // Added - requires verification
    LKA("LK", "SRI LANKA", "si", "SRI L")/*si, ta*/,
    SHN("SH", "ST HELENA", new String[]{"ST. HELENA"}, "en", "HELEN"),
    STK("ZZ", "ST KITTS & NEVIS", null), // Added - requires verification
    STL("ZZ", "ST LUCIA", (String) null, "LUCIA"), // Added - requires verification
    SPM("PM", "ST PIERRE & MIQUELON", new String[]{"ST. PIERRE"}, "fr"),
    STV("ZZ", "ST VINCENT & THE GRANADINES", (String) null, "VINCE"), // Added - requires verification
    SDN("SD", "SUDAN", "ar", "SUDAN"),
    SUR("SR", "SURINAME", "nl", "SURIN"),
    SJM("SJ", "SVALBARD AND JAN MAYEN ISLANDS", "no")/*no, ru*/,
    SWZ("SZ", "SWAZILAND", "ss", "SWAZI")/*en, ss*/,
    SWE("SE", "SWEDEN", "sv", "SWEDE"),
    CHE("CH", "SWITZERLAND", "de", "SWITZ")/*de, fr, it*/,
    SYR("SY", "SYRIA", new String[]{"SYRIAN ARAB REPUBLIC"}, "ar", "SYRIA"),
    TWN("TW", "TAIWAN", new String[]{"TAIWAN, PROVINCE OF CHINA"}, "zh", "TAIWA"),
    TJK("TJ", "TAJIKISTAN", "tg", "TADZH"),
    TZA("TZ", "TANZANIA", new String[]{"TANZANIA, UNITED REPUBLIC OF"}, "sw", "TANZA"),
    THA("TH", "THAILAND", "th", "THAIL"),
    TGO("TG", "TOGO", "fr", "TOGO")/*fr, ee*/,
    TKL("TK", "TOKELAU", "en", "TOKEL"),
    TON("TO", "TONGA", "to", "TONGA")/*to, en*/,
    TTO("TT", "TRINIDAD & TOBAGO", new String[]{"TRINIDAD AND TOBAGO"}, "en", "TRINI"),
    TUN("TN", "TUNISIA", "ar", "TUNIS"),
    TUR("TR", "TURKEY", "tr", "TURKE"),
    TKM("TM", "TURKMENISTAN", "tk", "TURKM"),
    TCA("TC", "TURKS & CAICOS ISLAND", new String[]{"TURKS AND CAICOS ISLANDS"}, "en", "TURKS"),
    TUV("TV", "TUVALU", "tv", "TUVAL"),
    UGA("UG", "UGANDA", "en", "UGAND"),
    UKR("UA", "UKRAINE", "uk", "UKRAI"),
    ARE("AE", "UNITED ARAB EMIRATES", "ar", "UAE"),
    GBR("GB", "UNITED KINGDOM", "en", "ENGLA")/*cy, en, gd, gv, kw*/,
    USA("US", "UNITED STATES OF AMERICA", new String[]{"USA", "UNITED STATES"}, "en", "USA"),
    UMI("UM", "UNITED STATES MINOR OUTLYING ISLANDS", "en"),
    URY("UY", "URUGUAY", "es", "URUGU"),
    USS("ZZ", "USSR", null), // Added - requires verification
    UZB("UZ", "UZBEKISTAN", "uz", "UZBEK"),
    VUT("VU", "VANUATU", "bi", "VANUA")/*bi, en*/,
    VAT("VA", "VATICAN CITY STATE", new String[]{"HOLY SEE (VATICAN CITY STATE)"}, "it")/*it, la*/,
    VEN("VE", "VENEZUELA", "es", "VENEZ"),
    VNM("VN", "VIETNAM", "vi", "VIETN"),
    VGB("VG", "VIRGIN ISLANDS (BRITISH)", "en", "BRWI"),
    VIR("VI", "VIRGIN ISLANDS OF USA", new String[]{"VIRGIN ISLANDS (U.S.)"}, "en", "VIRGI"),
    WLF("WF", "WALLIS & FUTUNA ISLANDS", new String[]{"WALLIS AND FUTUNA ISLANDS"}, "fr"),
    WSI("WI", "WEST INDIES", "en", "WI"),
    ESH("EH", "WESTERN SAHARA", "ar", "SAHAR"),
    YEM("YE", "YEMEN", "ar", "DYEM"),
    YUG("YU", "YUGOSLAVIA", "sl")/*mk, sl, hr*/,
    ZMB("ZM", "ZAMBIA", "en", "ZAMBI"),
    ZWE("ZW", "ZIMBABWE", "en", "ZIMBA");
    
    private static Map<String, Country> countryNames = new HashMap<String, Country>();
    private static Map<String, Country> countryCodes = new HashMap<String, Country>();
    private static Map<String, Country> countryISO2Codes = new HashMap<String, Country>();

    static {
        for (Country country : Country.values()) {
            countryNames.put(country.getCountryName(), country);

            // Check for alternative spellings
            if (country.getAlternatives() != null) {
                for (String alternative : country.getAlternatives()) {
                    countryNames.put(alternative, country);
                }
            }
        }

        for (Country country : Country.values()) {
            countryCodes.put(country.name(), country);
        }

        for (Country country : Country.values()) {
            countryISO2Codes.put(country.iso2Code, country);
        }
    }
    private Locale locale = null;
    private String iso2Code;
    private String countryName;
    private String[] alternatives;
    private String externalReference;

    private Country() {
        this.locale = Locale.UK;
    }

    private Country(String iso2Code, String name, String language) {
        this(iso2Code, name, null, language, null);
    }

    private Country(String iso2Code, String name, String language, String externalReference) {
        this(iso2Code, name, null, language, externalReference);
    }

    private Country(String iso2Code, String name, String[] alternatives, String language) {
        this.iso2Code = iso2Code;
        this.countryName = name;
        if (language != null) {
            this.locale = new Locale(language, iso2Code);
        } else {
            this.locale = Locale.UK;
        }

        this.alternatives = alternatives;
    }

    private Country(String iso2Code, String name, String[] alternatives, String language, String externalReference) {
        this.iso2Code = iso2Code;
        this.countryName = name;
        if (language != null) {
            this.locale = new Locale(language, iso2Code);
        } else {
            this.locale = Locale.UK;
        }

        this.alternatives = alternatives;
        this.externalReference = externalReference;
    }

    public String getCode() {
        return locale.getCountry();
    }

    public String getLocaleName() {
        return locale.getDisplayCountry();
    }

    public String getLanguage() {
        return locale.getDisplayLanguage();
    }

    public Locale getLocale() {
        return locale;
    }

    public Currency getCurrency() {
        Currency result = null;
        try {
            result = Currency.getInstance(locale);
        } catch (IllegalArgumentException ex) {
            result = Currency.getInstance(Locale.UK);
        }
        return result;
    }

    public static Country getCountryByName(String countryName) {
        return countryNames.get(countryName);
    }

    public static Country getCountryByIsoThree(String countryIsoThree) {
        return countryCodes.get(countryIsoThree);
    }

    public static Country getCountryByIsoTwo(String countryIsoTwo) {
        return countryISO2Codes.get(countryIsoTwo);
    }

    public String getCountryName() {
        return countryName;
    }

    public String[] getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(String[] alternatives) {
        this.alternatives = alternatives;
    }

    public String getIso2Code() {
        return iso2Code;
    }

    public void setIso2Code(String iso2Code) {
        this.iso2Code = iso2Code;
    }

    public String getExternalReference() {
        return externalReference;
    }
}
