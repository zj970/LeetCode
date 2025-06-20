<p>给你一个大小为 <code>m x n</code>&nbsp;的二维矩阵&nbsp;<code>grid</code>&nbsp;。你需要判断每一个格子&nbsp;<code>grid[i][j]</code>&nbsp;是否满足：</p>

<ul> 
 <li>如果它下面的格子存在，那么它需要等于它下面的格子，也就是&nbsp;<code>grid[i][j] == grid[i + 1][j]</code>&nbsp;。</li> 
 <li>如果它右边的格子存在，那么它需要不等于它右边的格子，也就是&nbsp;<code>grid[i][j] != grid[i][j + 1]</code>&nbsp;。</li> 
</ul>

<p>如果 <strong>所有</strong>&nbsp;格子都满足以上条件，那么返回 <code>true</code>&nbsp;，否则返回 <code>false</code>&nbsp;。</p>

<p>&nbsp;</p>

<p><strong class="example">示例 1：</strong></p>

<div class="example-block"> 
 <p><span class="example-io"><b>输入：</b>grid = [[1,0,2],[1,0,2]]</span></p> 
</div>

<p><span class="example-io"><b>输出：</b>true</span></p>

<p><strong>解释：</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2024/04/15/examplechanged.png" style="width: 254px; height: 186px;padding: 10px; background: #fff; border-radius: .5rem;" /></strong></p>

<p>网格图中所有格子都符合条件。</p>

<p><strong class="example">示例 2：</strong></p>

<div class="example-block"> 
 <p><span class="example-io"><b>输入：</b>grid = [[1,1,1],[0,0,0]]</span></p> 
</div>

<p><span class="example-io"><b>输出：</b>false</span></p>

<p><b>解释：</b></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2024/03/27/example21.png" style="width: 254px; height: 186px;padding: 10px; background: #fff; border-radius: .5rem;" /></strong></p>

<p>同一行中的格子值都相等。</p>

<p><strong class="example">示例 3：</strong></p>

<div class="example-block"> 
 <p><span class="example-io"><b>输入：</b>grid = [[1],[2],[3]]</span></p> 
</div>

<p><span class="example-io"><b>输出：</b>false</span></p>

<p><strong>解释：</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2024/03/31/changed.png" style="width: 86px; height: 277px;padding: 10px; background: #fff; border-radius: .5rem;" /></p>

<p>同一列中的格子值不相等。</p>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= n, m &lt;= 10</code></li> 
 <li><code>0 &lt;= grid[i][j] &lt;= 9</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li><li>矩阵</li></div></div><br><div><li>👍 23</li><li>👎 0</li></div>