class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        out_list = []
        if root == None:
            return []
        tree_path = [[root]]
        while len(tree_path) != 0:
            temp = tree_path.pop(0)
            out = []
            path = []
            for t in temp:
                out.append(t.val)
                if t.left:
                    path.append(t.left)
                if t.right:
                    path.append(t.right)
            out_list.append(out)
            if path:
                tree_path.append(path)
        return out_list
