# [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız root (7) dir.

1. Rootumuzu en başa yazıyoruz (rootu rastgele kendimiz seçiyoruz)
2. 5'i dizinimize eklemek istiyoruz ve root'a soruyoruz 5 senden büyük mü hayır büyük değil ozaman 5'i soluna ekliyoruz
3. 1'i eklemek istiyoruz ilk önce root'a soruyoruz 1' senden büyük mü hayır değil soluna geçiyoruz orda 5'e soruyoruz 1' senden büyük mü hayır değil 5'in soluna 1'i ekliyoruz
4. 8'i eklemek istiyoruz root'dan büyük olduğundan sağına ekliyoruz
5. 3'ü eklemek istiyoruz root'dan başlayarak sırasıyla büyük mü küçük mü diye soruyoruz ve 1'den büyük olduğu için sağına yazıyoruz
6. 6'yı eklemek istiyoruz aynı adımları takip ediyoruz ve 5'in sağına yazıyoruz
7. 0'ı eklemek istiyoruz ve aynı adımları takip ederek 1'in soluna yazıyoruz
8. 9'u eklemek istiyoruz ve 8 in sağına ekliyoruz
9. 4'ü eklemek istiyoruz ve 3'ün sağına yazıyoruz
10. 2'yi eklemek istiyoruz ve 3'ün soluna yazıyoruz

```
           7  
          / \
         5   8
        / \   \
       1   6   9 
      / \   
     0   3  
        / \
       2   4 

```