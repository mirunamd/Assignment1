# Assignment1

For Q1, I am using an array which holds all the occurences of all chars that appear in the first string. Say char 'a' appears twice, then v[97] is 2. 97 is the ascii code of the given char 'a'. Then for the second iteration through the second string I check whether v[character] is >=1 (is present). It has an overall complexity of O(n).

For Q2, I've implemented a singly linked list and the operations associated with it - size for retrieving its size and get that returns the element at the given position. To solve it, I just call get(size_of_list - k) to return the k-th element to the last. At the moment I am thinking about finding a way to stop using size since I'm already iterating through the list when I try to find that specific element. The overall complexity is that of find which is done in linear time O(n).
