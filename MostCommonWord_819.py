import re

paragraph = "Bob hit a ball, the hit Ball flew far after it was hit."
banned = "hit"

out = re.sub(r'[^\w\s]','',paragraph)
arrs = out.lower().split()
max = 0
max_index = None

for arr in arrs:
    if(arr != banned):
        count = arrs.count(arr)
        index = arrs.index(arr)
        if(max < count):
            max = count
            max_index = index

print(arrs[max_index])