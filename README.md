"# hadoop_learn" <br>
echo "# hadoop_learn" >> README.md  <br>
git init  <br>
git add README.md  <br>
git commit -m "first commit"  <br>
git remote add origin https://github.com/cwlbyggm/hadoop_learn.git  <br>
git push -u origin master  <br>

1、提交   代码出错<br>
![](https://github.com/cwlbyggm/poto/blob/master/hadoop/push_err.png)<br>
解决方案：<br>
git push origin  master<br>
git push -u origin master<br>


2、提交代码出错2<br>
![](https://github.com/cwlbyggm/poto/blob/master/hadoop/push_err2.png)<br>
解决方案：<br>
git add . <br>
git commit -m  "" <br>
git push -u origin master<br>


3、故障切换<br>
bin/hdfs haadmin -transitionToActive nn1 <br>
