package kontrolltoo;

import java.util.HashMap;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


class Mathematics implements MathInterface {
    String file_path;
    String file_content;
    String[] array_of_words;
    HashMap<String, Integer> word_counter;

    public Mathematics(String _path){
        this.file_path = ("C:\\Users\\Student Admin\\Desktop\\text.txt");
    }
    public void readfile(){
        Path file_path = Paths.get(this.file_path);

        try {
        byte[] file_content_in_bytes =  Files.readAllBytes(file_path);

        String file_content_str =  new String(file_content_in_bytes, StandardCharsets.UTF_8);
        this.file_content = file_content_str;

    } catch (IOException var_error) {
        var_error.printStackTrace();
    }


    }
    public void split_to_words(){
        this.array_of_words = this.file_content.split(",");

    }

    @Override
    public void words_to_lowercase() {
        for(int i = 0; i < this.array_of_words.length;i++){
            String words_in_array = this.array_of_words[i];
            String words_in_lowercase = words_in_array.toLowerCase();
            this.array_of_words[i] = words_in_lowercase;
        }
    }

    public void iMoreThanOnce(){
        int count = 0;
        for (int i = 0; i < words_in_array.length() - 1; i++) {
        for (int j = i + 1; j < words_in_array.length; j++) {

        if(words_in_array.charAt(i)==words_in_array.charAt(j)){
            count++;
        }
        }    
}

    }


}