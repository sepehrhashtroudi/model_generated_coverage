var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":135,"id":1420,"methods":[{"el":35,"sc":3,"sl":30},{"el":41,"sc":3,"sl":37},{"el":45,"sc":3,"sl":43},{"el":50,"sc":3,"sl":47},{"el":69,"sc":3,"sl":52},{"el":88,"sc":3,"sl":71},{"el":93,"sc":3,"sl":90},{"el":124,"sc":3,"sl":95},{"el":134,"sc":3,"sl":126}],"name":"JsonObjectDeserializationVisitor","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":30}],"name":"testStringsWithUnicodeChineseCharactersDeserialization","pass":true,"statements":[{"sl":34}]},"test_3":{"methods":[{"sl":30}],"name":"testStringsWithUnicodeChineseCharactersEscapedDeserialization","pass":true,"statements":[{"sl":34}]},"test_7":{"methods":[{"sl":30}],"name":"testStringsWithRawChineseCharactersDeserialization","pass":true,"statements":[{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1, 3, 7], [], [], [], [1, 3, 7], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
