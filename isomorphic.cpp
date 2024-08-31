#include <iostream>
#include <string>

bool isIsomorphic(std::string s, std::string t) {
    // Arrays to store the last seen positions of characters
    int lastSeenS[256] = {0};  // For string s
    int lastSeenT[256] = {0};  // For string t

    int n = s.length();

    // Iterate through each character in the strings
    for (int i = 0; i < n; ++i) {
        char ch1 = s[i];
        char ch2 = t[i];

        // Check if the last seen positions are different
        if (lastSeenS[ch1] != lastSeenT[ch2]) {
            return false;
        }

        // Update the last seen positions
        lastSeenS[ch1] = i + 1;  // Store position as index + 1
        lastSeenT[ch2] = i + 1;  // Store position as index + 1
    }

    // If no mismatches are found, the strings are isomorphic
    return true;
}

int main() {
    std::string s, t;

    // User-friendly prompts
    std::cout << "Enter the first string: ";
    std::cin >> s;
    std::cout << "Enter the second string: ";
    std::cin >> t;

    // Check if the strings are isomorphic
    if (isIsomorphic(s, t)) {
        std::cout << "The strings are isomorphic." << std::endl;
    } else {
        std::cout << "The strings are not isomorphic." << std::endl;
    }

    return 0;
}
