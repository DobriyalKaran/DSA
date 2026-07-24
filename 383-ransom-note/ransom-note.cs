public class Solution
{
    public bool CanConstruct(string ransomNote, string magazine)
    {
        Dictionary<char, int> map = new Dictionary<char, int>();

        foreach (char c in magazine)
        {
            if (map.ContainsKey(c))
                map[c]++;
            else
                map[c] = 1;
        }

        foreach (char c in ransomNote)
        {
            if (!map.ContainsKey(c) || map[c] == 0)
                return false;

            map[c]--;
        }

        return true;
    }
}