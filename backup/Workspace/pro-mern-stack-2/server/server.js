const express = require('express');
const { ApolloServer } = require('apollo-server-express');
const fs = require('fs');
let aboutMessage = "Issue Trackere API v1.0";

const IssueDB = [
    {
      id: 1, status: 'New', owner: 'Ravan', effort: 5,
      created: new Date('2018-08-15'), due: undefined,
      title: 'Error in console when clicking Add',
    },
    {
      id: 2, status: 'Assigned', owner: 'Eddie', effort: 14,
      created: new Date('2018-08-16'), due: new Date('2018-08-30'),
      title: 'Missing bottom border on panel',
    },
  ];

const resolvers = {
    Query: {
        about: ()=> aboutMessage,
        issueList,
    },
    Mutation: {
        setAboutMessage,
    },
};

function issueList() {
    return IssueDB;
}

function setAboutMessage(_, {message}) {
    return aboutMessage = message;
}

const server = new ApolloServer({
    typeDefs: fs.readFileSync('./server/schema.graphql', 'utf-8'),
    resolvers,
});

const app = express();
server.applyMiddleware({app, path: '/graphql'});

app.use(express.static('public'));

app.listen(3000, () => {
    console.log('App started on port 3000');
})

