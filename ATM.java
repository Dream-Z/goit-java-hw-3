class ATM {
  public int countBanknotes(int sum) {
    int[] bank = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    int counter = 0;
    int banknotes = 0;
    while (counter < bank.length){
      int currentBanknotesNumber = sum / bank[counter];
      if (sum % bank[counter] >= 0 && currentBanknotesNumber > 0){
        if(currentBanknotesNumber == 1) {
          banknotes += 1;
        } else {
          banknotes += currentBanknotesNumber;
        }
        sum -= bank[counter] * currentBanknotesNumber;
      }
      if (counter + 1 == bank.length && sum != 0){
        banknotes +=1;
      }
      counter++;
    }
    return banknotes;
  }
}
