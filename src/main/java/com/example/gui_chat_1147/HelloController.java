package com.example.gui_chat_1147;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
@FXML
private TextArea textArea;

@FXML
private TextField textField;

@FXML
protected void handlerSend() { // обработчик кнопки "Отправить"
	String text = textField.getText(); // берем текст из поля ввода текста
	textField.clear(); // очищаем textField
	//textArea.setWrapText(true); // перенос текста по словам.

	textArea.appendText(text+"\n----------------\n"); // разделитьель между сообщениями
	//textArea.setText(text); // устанавливаем его в поле textArea // будет всегда перезаписываться
	// запрет редактирования textArea // в файле hello-view.fxml
	// отправка сообщение по нажатию Enter // <TextField onAction="#handlerSend"
}

@FXML
private Label welcomeText;

@FXML
protected void onHelloButtonClick() {
	welcomeText.setText("Welcome to JavaFX Application!");
}
}