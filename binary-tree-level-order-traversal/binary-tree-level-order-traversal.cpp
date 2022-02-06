/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
#include <iostream>
#include <queue>
 
using namespace std;
 

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        if (root == NULL)
            return ans;
        queue<TreeNode*> q;
        q.push(root);
        vector<int> cl;
        while (!q.empty()) {
            int nodeCount = q.size();
 
        // Dequeue all nodes of current level and
        // Enqueue all nodes of next level
            while (nodeCount > 0)
            {
                TreeNode *node = q.front();
                // cout << node->val << " ";
                cl.push_back(node->val);
                q.pop();
                if (node->left != NULL)
                    q.push(node->left);
                if (node->right != NULL)
                    q.push(node->right);
                nodeCount--;
            }
            ans.push_back(cl);
            cl.clear();
            // cout << endl;
        }
        return ans;
        }
};