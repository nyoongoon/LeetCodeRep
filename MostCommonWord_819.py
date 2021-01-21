import re
import collections

paragraph = "Bob hit a ball, the hit Ball flew far after it was hit."
banned = "hit"
# 리스트 컴프리헨션 이용, 정규식 이용
words = [word for word in re.sub(r'[^\w]', ' ', paragraph)
         .lower().split() if word not in banned]
# collections의 Counter 의 most_common 이용
counts = collections.Counter(words)

print(counts.most_common(1)[0][0])
