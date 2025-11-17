# Project

### 登录界面

- 账户账号, 密码(加密)
- Login , Signup
- 用户认证

### 银行账户聚合

- 绑定多个银行卡账户
- 通过第三方api(安全问题考虑)user authentication, malicious  user, rate limiting, idempotency

### 账单管理与分类

- **订单生成**
    - 银行外部
    - 手动创建
- 一级分类: 收入, 支出, 转账
- 二级分类:
    - 收入: 工资, 奖金, 投资收益, 兼职
    - 支出: 餐饮, 购物, 交通, 家居, 订阅服务, 娱乐, 健康医疗, 子女教育, 宠物, 杂项
    - 转账: 信用卡还款, 账户间转账, 储蓄, 投资

### 预算管理

- **预算创建**
    - 与账单支出转账部分进行交互
    - 基于类别
    - 时间周期
- 进度条
    - 颜色预警
    - 核心数据展示
- 主动预警
    - 定时通知
    - 达到预警额度后通知 kafka

### 财务Dashboard

- 本月现金流
    - 指标: 总收入, 总支出(柱状图)
- 支出分类
    - 各支出占比(饼状图)
- 近期账单和订阅信息
    - 一个列表来显示未来内即将到期的账单和订阅
- **账户余额**
    - 大的净资产数字
    - 现金账户(总余额)
    - 信用卡(总负债)
- 近期交易
    - 3-5笔

## 数据库表结构

### users 用户表

id

username

password

date of brith

phone

email

last login time

### bank_accounts 银行账户表

id

user_id

account_name

account_number

bank_name

account_type

**balance or credit**

last_sync_time

### categories 分类表

id

parent_id

category_name

icon

color

### transactions 交易账单表

id

user_id

bank_account_id

category_id

transaction_type income expense transfer

amount

transaction_date

merchant_name

notes

### budgets 预算表

id

user_id

category_id

budget_name

amount

period_type weekly, monthly annually

start_date

end_date

created_date

last_updated_date

### notifications 通知表

id

user_id

notification_type

title

message

priority

created_date

### financial_reports 财务报表(dashboard)

id

user_id

period_type weekly, monthly annually

total_