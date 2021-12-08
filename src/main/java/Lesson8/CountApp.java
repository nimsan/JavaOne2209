package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountApp extends JFrame {
    private int value;

    private static final String COUNTER_NORMAL = "Счетчик в норме";
    private static final String COUNTER_IS_TOO_BIG = "Счетчик лишком большой";
    private static final String COUNTER_IS_TOO_LOW = "Вы натыкали очень мало";
    // Константы всегда пишутся БОЛЬШИМ ШРИФТОМ!!!

    public CountApp(final int initialValue) {
        this.value = initialValue;
        setBounds(500, 500, 300, 150);
        setTitle("Simple counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Создадим шрифт
        Font font = new Font("Arial", Font.BOLD, 32);

        //Создадим сам счетчик
        final JLabel countValue = new JLabel(String.valueOf(initialValue));
        countValue.setFont(font);
        countValue.setHorizontalAlignment(SwingConstants.CENTER);
        add(countValue, BorderLayout.CENTER);

        //доп.значение к счетчику
        final JLabel infoPane = new JLabel(COUNTER_NORMAL);
        infoPane.setHorizontalAlignment(SwingConstants.CENTER);
        add(infoPane, BorderLayout.NORTH);

        //уменьшение значения
        JButton decrement = new JButton("<");
        decrement.setFont(font);
        add(decrement, BorderLayout.WEST);

        //увеличение значения
        JButton increment = new JButton(">");
        increment.setFont(font);
        add(increment, BorderLayout.EAST);

        //Добавляем слушателей
        decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                countValue.setText(String.valueOf(value));
                if (value < -10) {
                    infoPane.setText(COUNTER_IS_TOO_LOW);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });

        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                countValue.setText(String.valueOf(value));
                if (value > 10) {
                    infoPane.setText(COUNTER_IS_TOO_BIG);
                } else {
                    infoPane.setText(COUNTER_NORMAL);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CountApp(0);
    }
}
