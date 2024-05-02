// Noted by Yige Huang
***************************************************************************************************
class Solution {
public:
    int romanToInt(string s) {
// Define the function for converting Roman to Integer
        unordered_map<char, int> symbol;
// Store the Roman number with the respective integer into a table
// Notice that the single string stored in 'char' must be surrpunded by single quotes. 
        symbol['I'] = 1;
        symbol['V'] = 5;
        symbol['X'] = 10;
        symbol['L'] = 50;
        symbol['C'] = 100;
        symbol['D'] = 500;
        symbol['M'] = 1000;
// Define each Roman number with its respective value/integer
        int num = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            if (symbol[s[i]] < symbol[s[i+1]]) 
            {
                num -= symbol[s[i]];
            }
            else
                {
                    num += symbol[s[i]];
// The hint is that the roman numbers are usually be written from the largest to the smallest, except for 4, 9, 40, 90,.....
// This hint can be used to group the roman numbers.
// In case of 4, 9, 40,....., the true value is given by substracting the value of roman number by the value of the roman number after it.
                  
            }
        }
        return num;
        
    }
};
************************************************************************************************
