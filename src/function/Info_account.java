
package function;

public class Info_account {

public static Integer id; //Номер аккаунта    
public static String login; //Логин
public static String pass; //Пароль
public static String LName; //Фамилия
public static String FName; //Имя   
public static String Patro; //Отчество
public static String INN; //ИНН
public static String Series; //Серия паспорта
public static String Num; //Номер паспорта
public static String DIss; //Дата выдачи паспорта
public static String DivCode; //Код отделения паспорта
public static String IssVH; //Кем выдан 
public static Integer Perm; //Код привелегии 1 - админ, 0 - пользователь 

public static Integer[] id_c = new Integer[100];// Номер счёта
public static Integer[] Sumid_c = new Integer[100];; // Баланс счёта
public static Integer[] id_vid = new Integer[100]; // Код вида счёта, всего три 1.Депозитный, 2.Карточный, 3 Текущий

public static Integer Lang = null; //Длинна массива

}

