#ifndef TREE_H
#define TREE_H

template<typename T>
struct BST_Node {
T val;
BST_Node* left;
BST_Node* right;

BST_Node(T v) : val(v),left(NULL),right(NULL)
{}

void insert(T v) {
    if(v>val){
        if (right==NULL) right = new BST_Node<T>(v);
        else right->insert(v);
    }
    else{
        if (left==NULL) left = new BST_Node<T>(v);
        else left->insert(v);
    }
}

};


template<typename T>
void delete_tree(BST_Node<T>* root){
    if (root==NULL) return;
    delete_tree(root->left);
    delete_tree(root->right);
    delete root;
}


//your work starts here
template<typename T>
int num_nodes(BST_Node<T>* root){
    int total = 1;
    if(root->left != NULL) {
        total += num_nodes(root->left);
    }
    if(root->right != NULL) {
        total += num_nodes(root->right);
    }
    return total;
}


template<typename T>
bool has_duplicate_val(BST_Node<T>* root){
    std::vector<int> nums;
    nums.push_back(root->val);
    if(root->left != NULL) {
        if(has_duplicate_val_helper(root->left, nums)) {
            return true;
        }
    }
    if(root->right != NULL) {
        if(has_duplicate_val_helper(root->right, nums)) {
            return true;
        }
    }
    return false;
}

template<typename T>
bool has_duplicate_val_helper(BST_Node<T>* node, std::vector<int> nums){
    if(std::find(nums.begin(), nums.end(), node->val) != nums.end()) {
        return true;
    }
    nums.push_back(node->val);
    if(node->left != NULL) {
        if(has_duplicate_val_helper(node->left, nums)) {
            return true;
        }
    }
    if(node->right != NULL) {
        if(has_duplicate_val_helper(node->right, nums)) {
            return true;
        }
    }
    return false;
}

template<typename T>
bool trees_identical(BST_Node<T>* a, BST_Node<T>* b){
    if(a->val != b->val) {
        return false;
    }
    if(a->left != NULL) {
        if(b->left != NULL) {
            return trees_identical(a->left, b->left);
        }
        return false;
    }
    else if (b->left != NULL) {
        return false;
    }
    if(a->right != NULL) {
        if(b->right != NULL) {
            return trees_identical(a->right, b->right);
        }
        return false;
    }
    else if(b->right != NULL) {
        return false;
    }
    return true;
}

#endif //TREE_H
