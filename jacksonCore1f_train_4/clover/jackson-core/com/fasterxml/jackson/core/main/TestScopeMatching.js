var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":107,"id":15187,"methods":[{"el":27,"sc":1,"sl":15},{"el":43,"sc":1,"sl":30},{"el":60,"sc":1,"sl":46},{"el":76,"sc":1,"sl":63},{"el":92,"sc":1,"sl":79}],"name":"TestScopeMatching","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_107":{"methods":[{"sl":15}],"name":"testUnclosedArray18","pass":true,"statements":[{"sl":16},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":25}]},"test_26":{"methods":[{"sl":46}],"name":"testMisssingColon55","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":52},{"sl":56},{"sl":58}]},"test_49":{"methods":[{"sl":63}],"name":"testWeirdToken59","pass":true,"statements":[{"sl":64},{"sl":65},{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":72},{"sl":74}]},"test_80":{"methods":[{"sl":79}],"name":"testEOFInName64","pass":true,"statements":[{"sl":80},{"sl":81},{"sl":82},{"sl":83},{"sl":84},{"sl":85},{"sl":88},{"sl":90}]},"test_85":{"methods":[{"sl":30}],"name":"testMismatchObjectToArray54","pass":true,"statements":[{"sl":31},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36},{"sl":39},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [107], [107], [], [107], [107], [107], [107], [107], [], [], [107], [], [], [], [], [85], [85], [85], [85], [85], [85], [85], [], [], [85], [], [85], [], [], [], [], [26], [26], [26], [26], [26], [26], [26], [], [], [], [26], [], [26], [], [], [], [], [49], [49], [49], [49], [49], [49], [49], [], [], [49], [], [49], [], [], [], [], [80], [80], [80], [80], [80], [80], [80], [], [], [80], [], [80], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
