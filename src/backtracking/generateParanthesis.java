package backtracking;

// LeetCode 22: Generate Parentheses
import java.util.ArrayList;
import java.util.List;

public class generateParanthesis {
    public List<String> generateparenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve("", 0, 0, n, ans);
        return ans;
    }
    private void solve(String curr,int open, int closed, int total,
                       List<String> ans) {

        if (curr.length() == 2 * total) {
            ans.add(curr);
            return;
        }

        if (open < total) {
            solve(curr + "(", open + 1, closed, total, ans);
        }

        if (closed < open) {
            solve(curr + ")", open, closed + 1, total, ans);
        }
    }

    public static void main(String[] args) {

        generateParanthesis gp = new generateParanthesis();

        System.out.println(gp.generateparenthesis(3));
    }
}
// Time Complexity: O(4^n / √n)
// Space Complexity: O(n)

