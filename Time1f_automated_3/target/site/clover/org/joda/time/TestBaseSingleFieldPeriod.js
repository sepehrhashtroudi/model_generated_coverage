var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":167,"id":21802,"methods":[{"el":35,"sc":5,"sl":33},{"el":39,"sc":5,"sl":37},{"el":43,"sc":5,"sl":41},{"el":46,"sc":5,"sl":45},{"el":49,"sc":5,"sl":48},{"el":61,"sc":1,"sl":52},{"el":90,"sc":1,"sl":62}],"name":"TestBaseSingleFieldPeriod","sl":28},{"el":165,"id":21845,"methods":[{"el":136,"sc":9,"sl":134},{"el":140,"sc":9,"sl":138},{"el":144,"sc":9,"sl":142},{"el":148,"sc":9,"sl":146},{"el":152,"sc":9,"sl":150},{"el":156,"sc":9,"sl":154},{"el":160,"sc":9,"sl":158},{"el":164,"sc":9,"sl":162}],"name":"TestBaseSingleFieldPeriod.Single","sl":132}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_20":{"methods":[{"sl":62},{"sl":134},{"sl":150},{"sl":158}],"name":"testToMutablePeriod193","pass":false,"statements":[{"sl":63},{"sl":64},{"sl":65},{"sl":135},{"sl":151},{"sl":159}]},"test_94":{"methods":[{"sl":52},{"sl":134},{"sl":158}],"name":"testValueIndexMethods191","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55},{"sl":56},{"sl":57},{"sl":135},{"sl":159}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [94], [94], [94], [94], [94], [94], [], [], [], [], [20], [20], [20], [20], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [94, 20], [94, 20], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [20], [20], [], [], [], [], [], [], [94, 20], [94, 20], [], [], [], [], [], [], [], []]
