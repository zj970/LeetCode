```flow
#The sum of two Numbers
>Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.
st=>start: Start
o1=>inputoutput: Input nums[]
o2=>inputoutput: Input target
cond=>condition: nums[i]+nums[j]=target(yes/no?)
i=>inputoutput: Out:[i,j]
e=>end: End
st->o1->o2->cond
cond(yes)->i->e
cond(no)->cond
```

