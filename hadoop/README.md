<div align="center"> <h3>Hadoop 完全分布式部署</h3></div>

<h5>1、部署架构</h5>

1）

<h5>2、机器与角色</h5>



<table border="1">
<tr>
<td>机器IP</td>
<td>NameNode</td>
<td>DataNode</td>
<td>ResourceManager</td>
<td>NodeManager</td>
<td>ZooKeeper</td>
<td>JN</td>
</tr>
<tr>
<td>192.168.1.60</td>
<td>*</td>
<td>*</td>
<td>*</td>
<td>ResourceManager</td>
<td>ResourceManager</td>
<td>ResourceManager</td>
</tr>
<tr>
<td>192.168.1.61</td>
<td>*</td>
<td>*</td>
<td></td>
<td>ResourceManager</td>
<td>ResourceManager</td>
<td>ResourceManager</td>
</tr>
<tr>
<td>192.168.1.62</td>
<td></td>
<td>*</td>
<td></td>
<td>ResourceManager</td>
<td>ResourceManager</td>
<td>ResourceManager</td>
</tr>
</table>
