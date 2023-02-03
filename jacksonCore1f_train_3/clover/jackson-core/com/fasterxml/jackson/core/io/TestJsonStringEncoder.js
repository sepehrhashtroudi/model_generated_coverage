var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":97,"id":15100,"methods":[{"el":31,"sc":1,"sl":15},{"el":47,"sc":1,"sl":34},{"el":56,"sc":1,"sl":50},{"el":65,"sc":1,"sl":59},{"el":96,"sc":5,"sl":86}],"name":"TestJsonStringEncoder","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_125":{"methods":[{"sl":50}],"name":"testQuoteAsString126","pass":true,"statements":[{"sl":51},{"sl":52},{"sl":53},{"sl":54},{"sl":55}]},"test_16":{"methods":[{"sl":59},{"sl":86}],"name":"testEncodeAsUTF8127","pass":true,"statements":[{"sl":60},{"sl":61},{"sl":62},{"sl":63},{"sl":88},{"sl":89},{"sl":90},{"sl":92},{"sl":93},{"sl":95}]},"test_27":{"methods":[{"sl":34}],"name":"testQuoteLongAsString125","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":37},{"sl":38},{"sl":39},{"sl":40},{"sl":42},{"sl":43},{"sl":44},{"sl":45},{"sl":46}]},"test_76":{"methods":[{"sl":15},{"sl":86}],"name":"testQuoteAsUTF841","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":20},{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":88},{"sl":89},{"sl":90},{"sl":92},{"sl":93},{"sl":95}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [76], [76], [76], [76], [76], [76], [76], [76], [76], [76], [76], [76], [76], [76], [76], [], [], [], [], [27], [27], [27], [27], [27], [27], [27], [], [27], [27], [27], [27], [27], [], [], [], [125], [125], [125], [125], [125], [125], [], [], [], [16], [16], [16], [16], [16], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [76, 16], [], [76, 16], [76, 16], [76, 16], [], [76, 16], [76, 16], [], [76, 16], [], [], []]
