var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":76,"id":14225,"methods":[{"el":28,"sc":1,"sl":15},{"el":35,"sc":1,"sl":31},{"el":44,"sc":1,"sl":38},{"el":75,"sc":5,"sl":65}],"name":"TestJsonStringEncoder","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_109":{"methods":[{"sl":15}],"name":"testQuoteLongAsString126","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27}]},"test_117":{"methods":[{"sl":38},{"sl":65}],"name":"testEncodeAsUTF8128","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":67},{"sl":68},{"sl":69},{"sl":71},{"sl":72},{"sl":74}]},"test_76":{"methods":[{"sl":31}],"name":"testCtrlChars127","pass":true,"statements":[{"sl":32},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [109], [109], [109], [109], [109], [109], [109], [], [109], [109], [109], [109], [109], [], [], [], [76], [76], [76], [76], [], [], [], [117], [117], [117], [117], [117], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [117], [], [117], [117], [117], [], [117], [117], [], [117], [], [], []]
