```
import pandas as pd

df1=pd.read_csv('time1.txt',names=['i','time'])
df2=pd.read_csv('time2.txt',names=['i','time'])
```

```
from scipy.optimize import curve_fit

def f(x,a,b):
  return a*x**b
```

```
import matplotlib.pyplot as plt
import numpy as np
plt.plot(df1.i,df1.time,'r')
plt.plot(df2.i,df2.time,'g')

x_show=np.array([i for i in range(0,1000000,10000)])
t,c=curve_fit(f,df1.i,df1.time,bounds=(0,[5,5]))
print('Exp:',t[1])
y_show=f(x_show,t[0],t[1])
plt.plot(x_show,y_show,color='r', linestyle='dashed')
t,c=curve_fit(f,df2.i,df2.time,bounds=(0,[5,5]))
print('Exp:',t[1])
plt.plot(x_show,y_show,color='g', linestyle='dashed')
```

```
import matplotlib.pyplot as plt
import numpy as np
plt.plot(df.i,df1.time,'r')
plt.plot(df1.i,df2.time,'g')

x_show=np.array([i for i in range(0,1000000,10000)])
t,c=curve_fit(f,df1.i,df1.time,bounds=(0,[5,5]))
y_show=f(x_show,t[0],t[1])
plt.plot(x_show,y_show,'r', linestyle='dashed')
t,c=curve_fit(f,df2.i,df2.time,bounds=(0,[5,5]))
y_show=f(x_show,t[0],t[1])
plt.plot(x_show,y_show,color='g', linestyle='dashed')
rt=20000000 # Replace your running time here
rt_1=30000000 # Replace your running time here
plt.plot(200000,rt,'r+')
plt.plot(200000,rt_1,'g+')
```
